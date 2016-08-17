package org.socraticgrid.fhir.dstu3.generated;

import org.hl7.fhir.dstu3.model.Medication;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;
import java.util.List;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import java.lang.String;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.BooleanType;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import java.lang.Boolean;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;
import org.hl7.fhir.dstu3.model.*;

public interface Iqicoremedication
{

   public Medication getAdaptee();

   public void setAdaptee(Medication param);

   public Medication.MedicationProductComponent getProduct();

   public qicoremedicationAdapter setProduct(
         Medication.MedicationProductComponent param);

   public boolean hasProduct();

   public boolean hasImplicitRules();

   public boolean hasImplicitRulesElement();

   public UriType getImplicitRulesElement();

   public String getImplicitRules();

   public Iqicoremedication setImplicitRulesElement(UriType param);

   public Iqicoremedication setImplicitRules(String param);

   public List<Resource> getContained();

   public Iqicoremedication setContained(List<Resource> param);

   public boolean hasContained();

   public Iqicoremedication addContained(Resource param);

   public Medication.MedicationPackageComponent getPackage();

   public qicoremedicationAdapter setPackage(
         Medication.MedicationPackageComponent param);

   public boolean hasPackage();

   public CodeableConcept getCode();

   public Iqicoremedication setCode(CodeableConcept param);

   public boolean hasCode();

   public boolean hasManufacturer();

   public Reference getManufacturer();

   public Iqicoremedication setManufacturer(Reference param);

   public Organization getManufacturerTarget();

   public Iqicoremedication setManufacturerTarget(Organization param);

   public qicoreorganizationAdapter getManufacturerAdapterTarget();

   public Iqicoremedication setManufacturerAdapterTarget(
         qicoreorganizationAdapter param);

   public boolean hasLanguage();

   public boolean hasLanguageElement();

   public CodeType getLanguageElement();

   public String getLanguage();

   public Iqicoremedication setLanguageElement(CodeType param);

   public Iqicoremedication setLanguage(String param);

   public boolean hasIsBrand();

   public boolean hasIsBrandElement();

   public BooleanType getIsBrandElement();

   public Boolean getIsBrand();

   public Iqicoremedication setIsBrandElement(BooleanType param);

   public Iqicoremedication setIsBrand(Boolean param);

   public boolean hasId();

   public boolean hasIdElement();

   public IdType getIdElement();

   public String getId();

   public Iqicoremedication setIdElement(IdType param);

   public Iqicoremedication setId(String param);
}