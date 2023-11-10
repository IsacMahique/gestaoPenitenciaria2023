package model;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-10-31T12:00:32", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(VisitaModel.class)
public class VisitaModel_ { 

    public static volatile SingularAttribute<VisitaModel, Integer> idProcesso;
    public static volatile SingularAttribute<VisitaModel, String> data;
    public static volatile SingularAttribute<VisitaModel, String> parentesco;
    public static volatile SingularAttribute<VisitaModel, Integer> idVisita;
    public static volatile SingularAttribute<VisitaModel, String> nomeVisitantes;
    public static volatile SingularAttribute<VisitaModel, String> nomeProcesso;

}