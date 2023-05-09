package dev.odes.fleet.develop.mapper;

import dev.odes.fleet.develop.entity.ViewModel;
import dev.odes.fleet.mysql.GenericMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ViewModelMapper extends GenericMapper<ViewModel> {
}
