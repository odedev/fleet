package dev.odes.fleet.core.uc.transform;

import dev.odes.fleet.common.transform.Transform;
import dev.odes.fleet.core.uc.entity.User;
import dev.odes.fleet.core.uc.model.UserModel;
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
