package dev.osmanthus.fleet.tool.develop.service;

import dev.osmanthus.fleet.common.service.AbstractService;
import dev.osmanthus.fleet.tool.develop.entity.Module;
import dev.osmanthus.fleet.tool.develop.entity.View;
import dev.osmanthus.fleet.tool.develop.model.ModuleModel;
import dev.osmanthus.fleet.tool.develop.model.ViewModel;
import dev.osmanthus.fleet.tool.develop.repository.ModuleRepository;
import dev.osmanthus.fleet.tool.develop.repository.ViewRepository;
import org.springframework.stereotype.Service;

@Service
public class ViewService extends AbstractService<View, ViewModel, ViewRepository> {
    private final ViewRepository viewRepository;
    private final ModuleRepository moduleRepository;

    public ViewService(ViewRepository viewRepository, ModuleRepository moduleRepository) {
        super(viewRepository);
        this.viewRepository = viewRepository;
        this.moduleRepository = moduleRepository;
    }

    @Override
    public ViewModel transform(View view) {
        if (view == null) {
            return null;
        }
        ViewModel viewModel = new ViewModel(view);

        Module module = this.moduleRepository.findOneById(view.getModule());
        View parentView = this.viewRepository.findOneById(view.getParent());
        if (module == null) {
            viewModel.setModule((ModuleModel) null);
        } else {
            viewModel.setModule(new ModuleModel(module));
        }
        if (parentView == null) {
            viewModel.setParent((ViewModel) null);
        } else {
            viewModel.setParent(new ViewModel(parentView));
        }
        // 此方式会一直查找下去
        /**
        if (view.getParent() != null) {
            viewModel.setParent(this.findById(view.getParent()));
        }
        */

        return viewModel;
    }

    @Override
    public View transform(ViewModel viewModel) {
        View view = viewModel.toEntity();
        return view;
    }
}
