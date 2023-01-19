package com.xworkz.repo;

import org.springframework.stereotype.Component;

import com.xworkz.dto.MissileDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component

public class MissileRepoImpl  implements MissileRepo{
	@Override
	public boolean save(MissileDTO aidDTO) {
		System.out.println("running save in repo");
		System.out.println("aidDTO"+aidDTO);
		return true;
	}

}
