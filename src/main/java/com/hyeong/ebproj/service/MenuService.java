package com.hyeong.ebproj.service;

import com.hyeong.ebproj.dto.MenuDTO;
import com.hyeong.ebproj.entity.Menu;
import com.hyeong.ebproj.repository.MenuRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    private final MenuRepository menuRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public MenuService(MenuRepository menuRepository, ModelMapper modelMapper) {
        this.menuRepository = menuRepository;
        this.modelMapper = modelMapper;
    }


    public MenuDTO findMenuByMenuCode(int menuCode) {
       Menu seletedMenu =  menuRepository.findById(menuCode).get();

       return modelMapper.map(seletedMenu,MenuDTO.class);
    }
}
