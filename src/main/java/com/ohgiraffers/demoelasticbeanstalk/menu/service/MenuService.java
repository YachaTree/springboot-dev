package com.ohgiraffers.demoelasticbeanstalk.menu.service;

import com.ohgiraffers.demoelasticbeanstalk.menu.dto.MenuDto;
import com.ohgiraffers.demoelasticbeanstalk.menu.entity.Menu;
import com.ohgiraffers.demoelasticbeanstalk.menu.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class MenuService {

    private final MenuRepository menuRepository;

    public List<MenuDto> getAllmenus() {
        List<Menu> menus = menuRepository.findAll();

        List<MenuDto> menuDtos = menus.stream().map(MenuDto::new).collect(Collectors.toList());


        return menuDtos;
    }
}
