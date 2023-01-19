package com.xworkz.repo;

import org.springframework.stereotype.Component;

import com.xworkz.dto.ResortDTO;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Component

public class ResortRepoImpl  implements ResortRepo {
	
		@Override
		public boolean save(ResortDTO aidDTO) {
			System.out.println("running save in repo");
			System.out.println("aidDTO"+aidDTO);
			return true;
		}

	

}
