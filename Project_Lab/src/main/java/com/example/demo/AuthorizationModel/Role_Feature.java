/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.AuthorizationModel;

import com.example.demo.modelKey.RoleFeatureKey;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import lombok.*;

/**
 *
 * @author admin1
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Role_Feature")
public class Role_Feature {

    @EmbeddedId
    RoleFeatureKey id;

    @ManyToOne
    @MapsId("roleId")
    @JoinColumn(name = "roleId")
    Role role;

    @ManyToOne
    @MapsId("featureId")
    @JoinColumn(name = "featureId")
    Feature feature;

}
