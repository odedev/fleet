package dev.osmanthus.fleet.core.system.service;

import dev.osmanthus.fleet.common.service.AbstractService;
import dev.osmanthus.fleet.core.system.entity.User;
import dev.osmanthus.fleet.core.system.model.UserModel;
import dev.osmanthus.fleet.core.system.repository.UserRepository;
import dev.osmanthus.fleet.core.system.transform.UserTransform;
import org.springframework.stereotype.Service;

@Service("dev.osmanthus.fleet.core.system.service.UserService")
public class UserService extends AbstractService<User, UserModel, UserRepository> {
    private final UserTransform userTransform;
    private final UserRepository userRepository;

    public UserService(UserTransform userTransform, UserRepository userRepository) {
        super(userRepository);
        this.userTransform = userTransform;
        this.userRepository = userRepository;
    }

    @Override
    public UserModel transform(User user) {
        return this.userTransform.toModel(user);
    }

    @Override
    public User transform(UserModel userModel) {
        return this.userTransform.toEntity(userModel);
    }

    @Override
    public void setDefaultValue(UserModel userModel) {
    }

    @Override
    public void validate(UserModel userModel) {
    }

    @Override
    public void beforeInsert(UserModel userModel) {
    }

    @Override
    public void beforeUpdate(UserModel userModel) {
    }

    @Override
    public void beforeDelete(UserModel userModel) {
    }

    @Override
    public void inserted(UserModel userModel) {
    }

    @Override
    public void updated(UserModel userModel) {
    }

    @Override
    public void deleted(UserModel userModel) {
    }
}
