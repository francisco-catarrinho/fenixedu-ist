/**
 * Copyright © 2013 Instituto Superior Técnico
 *
 * This file is part of FenixEdu IST Vigilancies.
 *
 * FenixEdu IST Vigilancies is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FenixEdu IST Vigilancies is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with FenixEdu IST Vigilancies.  If not, see <http://www.gnu.org/licenses/>.
 */
package pt.ist.fenixedu.vigilancies.ui.struts.action.vigilancy;

import java.io.Serializable;

import org.fenixedu.academic.domain.Person;

import pt.ist.fenixedu.vigilancies.domain.VigilantGroup;

public class VigilantBoundBean implements Serializable {

    Person person;
    VigilantGroup group;
    boolean bounded;

    VigilantBoundBean() {
        setPerson(null);
        setVigilantGroup(null);
        setBounded(false);
    }

    VigilantBoundBean(Person person, VigilantGroup group, boolean bounded) {
        setPerson(person);
        setVigilantGroup(group);
        setBounded(bounded);
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setVigilantGroup(VigilantGroup group) {
        this.group = group;
    }

    public void setBounded(boolean value) {
        this.bounded = value;
    }

    public Person getPerson() {
        return this.person;
    }

    public VigilantGroup getVigilantGroup() {
        return this.group;
    }

    public boolean isBounded() {
        return bounded;
    }

}
