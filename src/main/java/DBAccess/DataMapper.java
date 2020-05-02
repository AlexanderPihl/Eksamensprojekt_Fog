package DBAccess;

import FunctionLayer.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The purpose of DataMapper is to be able to make database queries
 *
 *  1. User
 *  2. User quotes
 *  3. Select option
 *  4.
 */

public class DataMapper {

    //##################
    //1. User queries
    //##################

    public static void createUser( User user ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO Users (email, password, role) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement( SQL, Statement.RETURN_GENERATED_KEYS );
            ps.setString( 1, user.getEmail() );
            ps.setString( 2, user.getPassword() );
            ps.setString( 3, user.getRole() );
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt( 1 );
            user.setId( id );
        } catch ( SQLException | ClassNotFoundException ex ) {
            throw new LoginSampleException( ex.getMessage() );
        }
    }

    public static User login( String email, String password ) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT users_id, role FROM users "
                    + "WHERE email=? AND password=?";
            PreparedStatement ps = con.prepareStatement( SQL );
            ps.setString( 1, email );
            ps.setString( 2, password );
            ResultSet rs = ps.executeQuery();
            if ( rs.next() ) {
                String role = rs.getString( "role" );
                int id = rs.getInt( "users_id" );
                User user = new User( email, password, role );
                user.setId( id );
                return user;
            } else {
                throw new LoginSampleException( "Could not validate user" );
            }
        } catch ( ClassNotFoundException | SQLException ex ) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    //##################
    //2. User quote queries
    //##################

    /**
     *
     * @param name
     * @param adress
     * @param zipcodeCity
     * @param phone
     * @param email
     * @param comments
     * @return userId
     * @throws LoginSampleException
     */
    public static int createUserQuote(String name,String adress,String zipcodeCity,int phone, String email,String comments) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO user_proposition (name,adress,zipcodeCity,phone,email,comments) VALUES (?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, name);
            ps.setString(2, adress);
            ps.setString(3,zipcodeCity);
            ps.setInt(4,phone);
            ps.setString(5,email);
            ps.setString(6, comments);
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int userId = ids.getInt(1);
            return userId;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    /**
     *
     * @param user_proposition_id
     * @param oc_width
     * @param oc_length
     * @param ots_width
     * @param ots_length
     * @param roof_type
     * @param roof_material
     * @param pitch
     * @return orderId
     * @throws LoginSampleException
     */
    public static int createQuoteOrder(int user_proposition_id,int oc_width,int oc_length,int ots_width, int ots_length,String roof_type,String roof_material,int pitch) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orders (user_proposition_id,oc_width,oc_length,ots_width,ots_length,roof_type,roof_material,pitch) VALUES (?,?,?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, user_proposition_id);
            ps.setInt(2, oc_width);
            ps.setInt(3, oc_length);
            ps.setInt(4, ots_width);
            ps.setInt(5, ots_length);
            ps.setString(6, roof_type);
            ps.setString(7, roof_material);
            ps.setInt(8, pitch);
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int orderId = ids.getInt(1);
            return orderId;
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    /**
     *
     * @param orders_id
     * @param material_type
     * @param material
     * @param description
     * @param length
     * @param quantity
     * @param unit
     * @param total_price
     * @throws LoginSampleException
     */
    public static void createQuoteOrderline(int orders_id, String material_type, String material, String description, int length, int quantity, String unit, double total_price) throws LoginSampleException {
        try {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orderline (orders_id,material_type,material,description,length,quantity,unit,total_price) VALUES (?,?,?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, orders_id);
            ps.setString(2, material_type);
            ps.setString(3, material);
            ps.setString(4, description);
            ps.setInt(5, length);
            ps.setInt(6, quantity);
            ps.setString(7, unit);
            ps.setDouble(8, total_price);
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException ex) {
            throw new LoginSampleException(ex.getMessage());
        }
    }

    //##################
    //3. Select option queries
    //##################

    /**
     *
     * @return carportWidth
     * @throws SQLException
     */
    public static List<CarportWidth> getCarportWidth() throws SQLException {
        List<CarportWidth> carportWidth = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT units FROM measurement_units WHERE c_width = '1'";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int width = rs.getInt("units");
                CarportWidth cw = new CarportWidth(width);
                carportWidth.add(cw);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new SQLException(ex.getMessage());
        }

        return carportWidth;
    }

    /**
     *
     * @return carportLength
     * @throws SQLException
     */
    public static List<CarportLength> getCarportLength() throws SQLException {
        List<CarportLength> carportLength = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT units FROM measurement_units WHERE c_length = '1'";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int length = rs.getInt("units");
                CarportLength cl = new CarportLength(length);
                carportLength.add(cl);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new SQLException(ex.getMessage());
        }

        return carportLength;
    }

    /**
     *
     * @return roofFlat
     * @throws SQLException
     */
    public static List<RoofFlat> getRoofFlat() throws SQLException {
        List<RoofFlat> roofFlat = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT roof_material FROM roof WHERE roof_type = 'fladt'";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String roofFlatOption = rs.getString("roof_material");
                RoofFlat rf = new RoofFlat(roofFlatOption);
                roofFlat.add(rf);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new SQLException(ex.getMessage());
        }

        return roofFlat;
    }

    /**
     *
     * @return roofRaised
     * @throws SQLException
     */
    public static List<RoofRaised> getRoofRaised() throws SQLException {
        List<RoofRaised> roofRaised = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT roof_material FROM roof WHERE roof_type = 'rejst'";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String roofRaisedOptions = rs.getString("roof_material");
                RoofRaised rfo = new RoofRaised(roofRaisedOptions);
                roofRaised.add(rfo);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new SQLException(ex.getMessage());
        }

        return roofRaised;
    }

    /**
     *
     * @return roofDegree
     * @throws SQLException
     */
    public static List<RoofDegree> getRoofDegree() throws SQLException {
        List<RoofDegree> roofDegree = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT pitch FROM roof_pitch";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int roofDegreeOptions = rs.getInt("pitch");
                RoofDegree rd = new RoofDegree(roofDegreeOptions);
                roofDegree.add(rd);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new SQLException(ex.getMessage());
        }

        return roofDegree;
    }

    /**
     *
     * @return shedWidth
     * @throws SQLException
     */
    public static List<ShedWidth> getShedWidth() throws SQLException {
        List<ShedWidth> shedWidth = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT units FROM measurement_units WHERE ts_width = '1'";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int shedWidthOptions = rs.getInt("units");
                ShedWidth sw = new ShedWidth(shedWidthOptions);
                shedWidth.add(sw);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new SQLException(ex.getMessage());
        }

        return shedWidth;
    }

    /**
     *
     * @return shedLength
     * @throws SQLException
     */
    public static List<ShedLength> getShedLength() throws SQLException {
        List<ShedLength> shedLength = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT units FROM measurement_units WHERE ts_length = '1'";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int shedLengthOptions = rs.getInt("units");
                ShedLength sl = new ShedLength(shedLengthOptions);
                shedLength.add(sl);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new SQLException(ex.getMessage());
        }

        return shedLength;
    }



    /**
     *
     * @param rafterLength
     * @return beam-dimension and beam-spacing for light roof
     * @throws SQLException
     */
    public static List<BeamDimensionLight> getBeamDimensionLight(double rafterLength) throws SQLException {
        List<BeamDimensionLight> beamDimensionLight = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT beam_dimension,beam_spacing FROM rafter_spacing WHERE category = 'let' and rafter_length >= ?" +
                    "ORDER BY rafter_length ASC LIMIT 1;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setDouble(1, rafterLength);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String beamDimension = rs.getString("beam_dimension");
                double beamSpacing = rs.getDouble("beam_spacing");
                BeamDimensionLight bd = new BeamDimensionLight(beamDimension,beamSpacing);
                beamDimensionLight.add(bd);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new SQLException(ex.getMessage());
        }

        return beamDimensionLight;
    }

    /**
     *
     * @param rafterLength
     * @return beam-dimension and beam-spacing for heavy roof
     * @throws SQLException
     */
    public static List<BeamDimensionHeavy> getBeamDimensionHeavy(double rafterLength) throws SQLException {
        List<BeamDimensionHeavy> beamDimensionHeavy = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT beam_dimension,beam_spacing FROM rafter_spacing WHERE category = 'tung' and rafter_length >= ?" +
                    "ORDER BY rafter_length ASC LIMIT 1;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setDouble(1, rafterLength);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String beamDimension = rs.getString("beam_dimension");
                double beamSpacing = rs.getDouble("beam_spacing");
                BeamDimensionHeavy bd = new BeamDimensionHeavy(beamDimension,beamSpacing);
                beamDimensionHeavy.add(bd);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new SQLException(ex.getMessage());
        }

        return beamDimensionHeavy;
    }

    /**
     *
     * @return HashMap of pitch and factor
     * @throws SQLException
     */
    public static Map<Integer, Double> getPitchFactor() throws SQLException {
        Map<Integer, Double> pitchFactor = new HashMap<>();

        try {
            Connection con = Connector.connection();
            String SQL = "SELECT pitch,factor FROM roof_pitch;";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int pitch = rs.getInt("pitch");
                double factor = rs.getDouble("factor");
                pitchFactor.put(pitch,factor);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            throw new SQLException(ex.getMessage());
        }
        return pitchFactor;
    }
}
