package dev.odes.fleet.develop.service;

import dev.odes.fleet.common.service.AbstractService;
import dev.odes.fleet.develop.entity.View;
import dev.odes.fleet.develop.model.ViewModel;
import dev.odes.fleet.develop.repository.ViewRepository;
import org.springframework.stereotype.Service;

@Service
public class ViewService extends AbstractService<View, ViewModel, ViewRepository> {
    private final ViewRepository viewRepository;

    public ViewService(ViewRepository viewRepository) {
        super(viewRepository);
        this.viewRepository = viewRepository;
    }

    @Override
    public ViewModel transform(View view) {
        ViewModel viewModel = new ViewModel();
        if (view.getParent() != null) {
            viewModel.setParent(this.findById(view.getId()));
        }

        return viewModel;
    }

    @Override
    public View transform(ViewModel viewModel) {
        View view = new View();
        return view;
    }
}
