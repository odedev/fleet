package dev.odes.fleet.develop.service;

import dev.odes.fleet.common.service.AbstractService;
import dev.odes.fleet.develop.entity.Module;
import dev.odes.fleet.develop.entity.View;
import dev.odes.fleet.develop.model.ModuleModel;
import dev.odes.fleet.develop.model.ViewModel;
import dev.odes.fleet.develop.repository.ModuleRepository;
import dev.odes.fleet.develop.repository.ViewRepository;
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

        Module module = this.moduleRepository.findById(view.getModule());
        View parentView = this.viewRepository.findById(view.getParent());
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
