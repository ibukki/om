package com.bubuwork.jf.om.bean;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.bubuwork.jf.om.entity.MaintainOrder;

public class MaintainOrderSpecs {
 
  public static Specification<MaintainOrder> hasPhone(final String mobile){
    return new Specification<MaintainOrder>() {
      public Predicate toPredicate(Root<MaintainOrder> root, CriteriaQuery<?> query,
            CriteriaBuilder builder) {
        
        return builder.equal(root.get("mobile"), mobile);        
      }
    };
  }
  
  public static Specification<MaintainOrder> hasMaintainTypes(final List<MaintainTypeEnum> mTypes){
    return new Specification<MaintainOrder>() {
      public Predicate toPredicate(Root<MaintainOrder> root, CriteriaQuery<?> query,
            CriteriaBuilder builder) {
        List<String> types = new ArrayList<String>();
        if(mTypes != null && !mTypes.isEmpty()){
          for (MaintainTypeEnum maintainTypeEnum : mTypes) {
            types.add(maintainTypeEnum.toString());
          }
        }
        return root.get("maintainType").in(types);
      }
    };
  }
}
