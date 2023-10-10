package dev.odes.fleet.core.system.transform;

import dev.odes.fleet.common.transform.Transform;
import dev.odes.fleet.core.system.entity.User;
import dev.odes.fleet.core.system.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserTransform implements Transform<User, UserModel> {

    @Override
    public UserModel toModel(User user) {
        UserModel userModel = new UserModel(user);
        return userModel;
    }

    @Override
    public User toEntity(UserModel userModel) {
        return userModel.toEntity();
    }
}
