package zlogger.logic.services;

import zlogger.logic.models.User;
import zlogger.logic.models.UserDetails;
import zlogger.logic.models.Wall;

public interface UserService extends GenericService<User, String> {

    public Wall getWall(User owner);

    public UserDetails getUserDetails(User user);

}
