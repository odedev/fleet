package dev.osmanthus.fleet.core.system.transform;

import dev.osmanthus.fleet.common.transform.Transform;
import dev.osmanthus.fleet.core.system.entity.User;
import dev.osmanthus.fleet.core.system.enumeration.UserStatusEnum;
import dev.osmanthus.fleet.core.system.enumeration.UserTypeEnum;
import dev.osmanthus.fleet.core.system.model.UserModel;
import org.springframework.stereotype.Component;

@Component("dev.osmanthus.fleet.core.system.transform.UserTransform")
public class UserTransform implements Transform<User, UserModel> {

    @Override
    public UserModel toModel(User user) {
        UserModel userModel = new UserModel();
        if (user != null) {
            userModel.setId(user.getId());
            userModel.setUsername(user.getUsername());
            userModel.setPassword(user.getPassword());
            userModel.setCode(user.getCode());
            userModel.setName(user.getName());
            userModel.setEmail(user.getEmail());
            userModel.setPhone(user.getPhone());
            userModel.setType(UserTypeEnum.getByValue(user.getType()));
            userModel.setStatus(UserStatusEnum.getByValue(user.getStatus()));
            userModel.setIsSuperAdmin(user.getIsSuperAdmin());
            userModel.setNote(user.getNote());
        }
        return userModel;
    }

    @Override
    public User toEntity(UserModel userModel) {
        User user = new User();
        if (userModel != null) {
            user.setId(userModel.getId());
            user.setUsername(userModel.getUsername());
            user.setPassword(userModel.getPassword());
            user.setCode(userModel.getCode());
            user.setName(userModel.getName());
            user.setEmail(userModel.getEmail());
            user.setPhone(userModel.getPhone());
            user.setType(userModel.getType().getValue());
            user.setStatus(userModel.getStatus().getValue());
            user.setIsSuperAdmin(userModel.getIsSuperAdmin());
            user.setNote(userModel.getNote());
        }
        return user;
    }
}
