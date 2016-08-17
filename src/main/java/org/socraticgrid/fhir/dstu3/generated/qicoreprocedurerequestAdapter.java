package org.socraticgrid.fhir.dstu3.generated;

import org.socraticgrid.fhir.dstu3.generated.Iqicoreprocedurerequest;
import org.hl7.fhir.dstu3.model.ProcedureRequest;
import org.hl7.fhir.dstu3.model.Annotation;
import java.util.List;
import org.hl7.fhir.dstu3.model.IdType;
import java.lang.String;
import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.UriType;
import org.hl7.fhir.dstu3.model.CodeType;
import org.hl7.fhir.dstu3.model.Enumeration;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.Resource;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.RelatedPerson;
import org.hl7.fhir.dstu3.model.Device;
import org.hl7.fhir.dstu3.model.DecimalType;
import org.hl7.fhir.dstu3.model.Type;
import org.hl7.fhir.dstu3.model.Enumerations;
import org.hl7.fhir.dstu3.model.Condition;
import org.hl7.fhir.dstu3.model.Group;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Period;
import org.hl7.fhir.dstu3.model.Timing;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.Identifier;
import org.hl7.fhir.dstu3.model.BooleanType;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.BodySite;
import org.hl7.fhir.dstu3.model.*;
import ca.uhn.fhir.model.api.ExtensionDt;

public class qicoreprocedurerequestAdapter implements Iqicoreprocedurerequest
{

   private ProcedureRequest adaptedClass;

   public qicoreprocedurerequestAdapter()
   {
      this.adaptedClass = new org.hl7.fhir.dstu3.model.ProcedureRequest();
   }

   public qicoreprocedurerequestAdapter(ProcedureRequest adaptee)
   {
      this.adaptedClass = adaptee;
   }

   public ProcedureRequest getAdaptee()
   {
      return adaptedClass;
   }

   public void setAdaptee(ProcedureRequest param)
   {
      this.adaptedClass = param;
   }

   public List<Annotation> getNotes()
   {
      try
      {
         return adaptedClass.getNotes();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Notes", e);
      }
   }

   public Iqicoreprocedurerequest setNotes(List<Annotation> param)
   {
      adaptedClass.setNotes(param);
      return this;
   }

   public boolean hasNotes()
   {
      return adaptedClass.hasNotes();
   }

   public Iqicoreprocedurerequest addNotes(Annotation param)
   {
      adaptedClass.addNotes(param);
      return this;
   }

   public Annotation addNotes()
   {
      return adaptedClass.addNotes();
   }

   public boolean hasId()
   {
      return adaptedClass.hasId();
   }

   public boolean hasIdElement()
   {
      return adaptedClass.hasIdElement();
   }

   public IdType getIdElement()
   {
      try
      {
         return adaptedClass.getIdElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting IdElement", e);
      }
   }

   public String getId()
   {
      try
      {
         return adaptedClass.getId();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Id", e);
      }
   }

   public Iqicoreprocedurerequest setIdElement(IdType param)
   {
      adaptedClass.setIdElement(param);
      return this;
   }

   public Iqicoreprocedurerequest setId(String param)
   {
      adaptedClass.setId(param);
      return this;
   }

   public CodeableConcept getReasonRefused()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/procedurerequest-reasonRefused");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.CodeableConcept) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for reasonRefused");
      }
   }

   public Iqicoreprocedurerequest setReasonRefused(CodeableConcept param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/StructureDefinition/procedurerequest-reasonRefused")
            .setValue(param);
      return this;
   }

   public boolean hasImplicitRules()
   {
      return adaptedClass.hasImplicitRules();
   }

   public boolean hasImplicitRulesElement()
   {
      return adaptedClass.hasImplicitRulesElement();
   }

   public UriType getImplicitRulesElement()
   {
      try
      {
         return adaptedClass.getImplicitRulesElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ImplicitRulesElement", e);
      }
   }

   public String getImplicitRules()
   {
      try
      {
         return adaptedClass.getImplicitRules();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ImplicitRules", e);
      }
   }

   public Iqicoreprocedurerequest setImplicitRulesElement(UriType param)
   {
      adaptedClass.setImplicitRulesElement(param);
      return this;
   }

   public Iqicoreprocedurerequest setImplicitRules(String param)
   {
      adaptedClass.setImplicitRules(param);
      return this;
   }

   public boolean hasLanguage()
   {
      return adaptedClass.hasLanguage();
   }

   public boolean hasLanguageElement()
   {
      return adaptedClass.hasLanguageElement();
   }

   public CodeType getLanguageElement()
   {
      try
      {
         return adaptedClass.getLanguageElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting LanguageElement", e);
      }
   }

   public String getLanguage()
   {
      try
      {
         return adaptedClass.getLanguage();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Language", e);
      }
   }

   public Iqicoreprocedurerequest setLanguageElement(CodeType param)
   {
      adaptedClass.setLanguageElement(param);
      return this;
   }

   public Iqicoreprocedurerequest setLanguage(String param)
   {
      adaptedClass.setLanguage(param);
      return this;
   }

   public boolean hasPriority()
   {
      return adaptedClass.hasPriority();
   }

   public boolean hasPriorityElement()
   {
      return adaptedClass.hasPriorityElement();
   }

   public ProcedureRequest.ProcedureRequestPriority getPriority()
   {
      try
      {
         return adaptedClass.getPriority();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Priority", e);
      }
   }

   public Enumeration<ProcedureRequest.ProcedureRequestPriority> getPriorityElement()
   {
      try
      {
         return adaptedClass.getPriorityElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PriorityElement", e);
      }
   }

   public Iqicoreprocedurerequest setPriority(
         ProcedureRequest.ProcedureRequestPriority param)
   {
      adaptedClass.setPriority(param);
      return this;
   }

   public Iqicoreprocedurerequest setPriorityElement(
         Enumeration<ProcedureRequest.ProcedureRequestPriority> param)
   {
      adaptedClass.setPriorityElement(param);
      return this;
   }

   public Reference getOrderer()
   {
      try
      {
         return adaptedClass.getOrderer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Orderer", e);
      }
   }

   public Resource getOrdererTarget()
   {
      try
      {
         return adaptedClass.getOrdererTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting OrdererTarget", e);
      }
   }

   public boolean hasOrderer()
   {
      return adaptedClass.hasOrderer();
   }

   public Reference getOrdererPractitioner()
   {
      try
      {
         return adaptedClass.getOrderer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Orderer", e);
      }
   }

   public Iqicoreprocedurerequest setOrderer(Reference param)
   {
      adaptedClass.setOrderer(param);
      return this;
   }

   public Practitioner getOrdererPractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getOrdererTarget();
   }

   public Iqicoreprocedurerequest setOrdererTarget(Practitioner param)
   {
      adaptedClass.setOrdererTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getOrdererPractitionerAdapterTarget()
   {
      if (adaptedClass.getOrderer().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getOrderer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setOrdererAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setOrdererTarget(param.getAdaptee());
      return this;
   }

   public Reference getOrdererPatient()
   {
      try
      {
         return adaptedClass.getOrderer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Orderer", e);
      }
   }

   public Patient getOrdererPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getOrdererTarget();
   }

   public Iqicoreprocedurerequest setOrdererTarget(Patient param)
   {
      adaptedClass.setOrdererTarget(param);
      return this;
   }

   public qicorepatientAdapter getOrdererPatientAdapterTarget()
   {
      if (adaptedClass.getOrderer().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getOrderer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setOrdererAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setOrdererTarget(param.getAdaptee());
      return this;
   }

   public Reference getOrdererRelatedPerson()
   {
      try
      {
         return adaptedClass.getOrderer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Orderer", e);
      }
   }

   public RelatedPerson getOrdererRelatedPersonTarget()
   {
      return (org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
            .getOrdererTarget();
   }

   public Iqicoreprocedurerequest setOrdererTarget(RelatedPerson param)
   {
      adaptedClass.setOrdererTarget(param);
      return this;
   }

   public qicorerelatedpersonAdapter getOrdererRelatedPersonAdapterTarget()
   {
      if (adaptedClass.getOrderer().getResource() instanceof org.hl7.fhir.dstu3.model.RelatedPerson)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorerelatedpersonAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorerelatedpersonAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
                     .getOrderer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setOrdererAdapterTarget(
         qicorerelatedpersonAdapter param)
   {
      adaptedClass.setOrdererTarget(param.getAdaptee());
      return this;
   }

   public Reference getOrdererDevice()
   {
      try
      {
         return adaptedClass.getOrderer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Orderer", e);
      }
   }

   public Device getOrdererDeviceTarget()
   {
      return (org.hl7.fhir.dstu3.model.Device) adaptedClass
            .getOrdererTarget();
   }

   public Iqicoreprocedurerequest setOrdererTarget(Device param)
   {
      adaptedClass.setOrdererTarget(param);
      return this;
   }

   public qicoredeviceAdapter getOrdererDeviceAdapterTarget()
   {
      if (adaptedClass.getOrderer().getResource() instanceof org.hl7.fhir.dstu3.model.Device)
      {
         org.socraticgrid.fhir.dstu3.generated.qicoredeviceAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicoredeviceAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Device) adaptedClass
                     .getOrderer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setOrdererAdapterTarget(
         qicoredeviceAdapter param)
   {
      adaptedClass.setOrdererTarget(param.getAdaptee());
      return this;
   }

   public CodeType getAppropriatenessScoreCodeType()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/procedurerequest-appropriatenessScore");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.CodeType) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for appropriatenessScore");
      }
   }

   public Iqicoreprocedurerequest setAppropriatenessScore(CodeType param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/procedurerequest-appropriatenessScore")
            .setValue(param);
      return this;
   }

   public DecimalType getAppropriatenessScoreDecimalType()
   {
      List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
            .getExtensionsByUrl("http://hl7.org/fhir/qicore/StructureDefinition/procedurerequest-appropriatenessScore");
      if (extensions == null || extensions.size() <= 0)
      {
         return null;
      }
      else if (extensions.size() == 1)
      {
         return (org.hl7.fhir.dstu3.model.DecimalType) extensions.get(0)
               .getValue();
      }
      else
      {
         throw new RuntimeException(
               "More than one extension exists for appropriatenessScore");
      }
   }

   public Iqicoreprocedurerequest setAppropriatenessScore(DecimalType param)
   {
      adaptedClass
            .addExtension()
            .setUrl("http://hl7.org/fhir/qicore/StructureDefinition/procedurerequest-appropriatenessScore")
            .setValue(param);
      return this;
   }

   public Type getReason()
   {
      try
      {
         return adaptedClass.getReason();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Reason", e);
      }
   }

   public Iqicoreprocedurerequest setReason(Type param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public CodeableConcept getReasonCodeableConcept()
   {
      try
      {
         return adaptedClass.getReasonCodeableConcept();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ReasonCodeableConcept", e);
      }
   }

   public boolean hasReasonCodeableConcept()
   {
      return adaptedClass.hasReasonCodeableConcept();
   }

   public boolean hasReason()
   {
      return adaptedClass.hasReason();
   }

   public Reference getReasonReference()
   {
      try
      {
         return adaptedClass.getReasonReference();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ReasonReference", e);
      }
   }

   public Condition getReasonTarget()
   {
      return (org.hl7.fhir.dstu3.model.Condition) ((org.hl7.fhir.dstu3.model.Reference) adaptedClass
            .getReason()).getResource();
   }

   public Iqicoreprocedurerequest setReason(Reference param)
   {
      adaptedClass.setReason(param);
      return this;
   }

   public Iqicoreprocedurerequest setReasonTarget(Condition param)
   {
      Reference reference = new Reference(param);
      adaptedClass.setReason(reference);
      return this;
   }

   public boolean hasStatus()
   {
      return adaptedClass.hasStatus();
   }

   public boolean hasStatusElement()
   {
      return adaptedClass.hasStatusElement();
   }

   public ProcedureRequest.ProcedureRequestStatus getStatus()
   {
      try
      {
         return adaptedClass.getStatus();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Status", e);
      }
   }

   public Enumeration<ProcedureRequest.ProcedureRequestStatus> getStatusElement()
   {
      try
      {
         return adaptedClass.getStatusElement();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting StatusElement", e);
      }
   }

   public Iqicoreprocedurerequest setStatus(
         ProcedureRequest.ProcedureRequestStatus param)
   {
      adaptedClass.setStatus(param);
      return this;
   }

   public Iqicoreprocedurerequest setStatusElement(
         Enumeration<ProcedureRequest.ProcedureRequestStatus> param)
   {
      adaptedClass.setStatusElement(param);
      return this;
   }

   public Reference getSubject()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Subject", e);
      }
   }

   public Resource getSubjectTarget()
   {
      try
      {
         return adaptedClass.getSubjectTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting SubjectTarget", e);
      }
   }

   public boolean hasSubject()
   {
      return adaptedClass.hasSubject();
   }

   public Reference getSubjectPatient()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Subject", e);
      }
   }

   public Iqicoreprocedurerequest setSubject(Reference param)
   {
      adaptedClass.setSubject(param);
      return this;
   }

   public Patient getSubjectPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getSubjectTarget();
   }

   public Iqicoreprocedurerequest setSubjectTarget(Patient param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public qicorepatientAdapter getSubjectPatientAdapterTarget()
   {
      if (adaptedClass.getSubject().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getSubject().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setSubjectAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setSubjectTarget(param.getAdaptee());
      return this;
   }

   public Reference getSubjectGroup()
   {
      try
      {
         return adaptedClass.getSubject();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Subject", e);
      }
   }

   public Group getSubjectGroupTarget()
   {
      return (org.hl7.fhir.dstu3.model.Group) adaptedClass.getSubjectTarget();
   }

   public Iqicoreprocedurerequest setSubjectTarget(Group param)
   {
      adaptedClass.setSubjectTarget(param);
      return this;
   }

   public Type getScheduled()
   {
      try
      {
         return adaptedClass.getScheduled();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Scheduled", e);
      }
   }

   public Iqicoreprocedurerequest setScheduled(Type param)
   {
      adaptedClass.setScheduled(param);
      return this;
   }

   public DateTimeType getScheduledDateTimeType()
   {
      try
      {
         return adaptedClass.getScheduledDateTimeType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ScheduledDateTimeType", e);
      }
   }

   public boolean hasScheduledDateTimeType()
   {
      return adaptedClass.hasScheduledDateTimeType();
   }

   public Period getScheduledPeriod()
   {
      try
      {
         return adaptedClass.getScheduledPeriod();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ScheduledPeriod", e);
      }
   }

   public boolean hasScheduledPeriod()
   {
      return adaptedClass.hasScheduledPeriod();
   }

   public Timing getScheduledTiming()
   {
      try
      {
         return adaptedClass.getScheduledTiming();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting ScheduledTiming", e);
      }
   }

   public boolean hasScheduledTiming()
   {
      return adaptedClass.hasScheduledTiming();
   }

   public List<Resource> getContained()
   {
      try
      {
         return adaptedClass.getContained();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Contained", e);
      }
   }

   public Iqicoreprocedurerequest setContained(List<Resource> param)
   {
      adaptedClass.setContained(param);
      return this;
   }

   public boolean hasContained()
   {
      return adaptedClass.hasContained();
   }

   public Iqicoreprocedurerequest addContained(Resource param)
   {
      adaptedClass.addContained(param);
      return this;
   }

   public boolean hasEncounter()
   {
      return adaptedClass.hasEncounter();
   }

   public Reference getEncounter()
   {
      try
      {
         return adaptedClass.getEncounter();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Encounter", e);
      }
   }

   public Iqicoreprocedurerequest setEncounter(Reference param)
   {
      adaptedClass.setEncounter(param);
      return this;
   }

   public Encounter getEncounterTarget()
   {
      return (org.hl7.fhir.dstu3.model.Encounter) adaptedClass
            .getEncounterTarget();
   }

   public Iqicoreprocedurerequest setEncounterTarget(Encounter param)
   {
      adaptedClass.setEncounterTarget(param);
      return this;
   }

   public qicoreencounterAdapter getEncounterAdapterTarget()
   {
      if (adaptedClass.getEncounter().getResource() instanceof org.hl7.fhir.dstu3.model.Encounter)
      {
         org.socraticgrid.fhir.dstu3.generated.qicoreencounterAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicoreencounterAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Encounter) adaptedClass
                     .getEncounter().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setEncounterAdapterTarget(
         qicoreencounterAdapter param)
   {
      adaptedClass.setEncounterTarget(param.getAdaptee());
      return this;
   }

   public List<Identifier> getIdentifier()
   {
      try
      {
         return adaptedClass.getIdentifier();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Identifier", e);
      }
   }

   public Iqicoreprocedurerequest setIdentifier(List<Identifier> param)
   {
      adaptedClass.setIdentifier(param);
      return this;
   }

   public boolean hasIdentifier()
   {
      return adaptedClass.hasIdentifier();
   }

   public Iqicoreprocedurerequest addIdentifier(Identifier param)
   {
      adaptedClass.addIdentifier(param);
      return this;
   }

   public Identifier addIdentifier()
   {
      return adaptedClass.addIdentifier();
   }

   public Type getAsNeeded()
   {
      try
      {
         return adaptedClass.getAsNeeded();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AsNeeded", e);
      }
   }

   public Iqicoreprocedurerequest setAsNeeded(Type param)
   {
      adaptedClass.setAsNeeded(param);
      return this;
   }

   public BooleanType getAsNeededBooleanType()
   {
      try
      {
         return adaptedClass.getAsNeededBooleanType();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AsNeededBooleanType", e);
      }
   }

   public boolean hasAsNeededBooleanType()
   {
      return adaptedClass.hasAsNeededBooleanType();
   }

   public CodeableConcept getAsNeededCodeableConcept()
   {
      try
      {
         return adaptedClass.getAsNeededCodeableConcept();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting AsNeededCodeableConcept",
               e);
      }
   }

   public boolean hasAsNeededCodeableConcept()
   {
      return adaptedClass.hasAsNeededCodeableConcept();
   }

   public List<CodeableConcept> getBodySite()
   {
      try
      {
         return adaptedClass.getBodySite();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting BodySite", e);
      }
   }

   public Iqicoreprocedurerequest setBodySite(List<CodeableConcept> param)
   {
      adaptedClass.setBodySite(param);
      return this;
   }

   public boolean hasBodySite()
   {
      return adaptedClass.hasBodySite();
   }

   public Iqicoreprocedurerequest addBodySite(CodeableConcept param)
   {
      adaptedClass.addBodySite(param);
      return this;
   }

   public CodeableConcept addBodySite()
   {
      return adaptedClass.addBodySite();
   }

   public Reference getPerformer()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public Resource getPerformerTarget()
   {
      try
      {
         return adaptedClass.getPerformerTarget();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting PerformerTarget", e);
      }
   }

   public boolean hasPerformer()
   {
      return adaptedClass.hasPerformer();
   }

   public Reference getPerformerPractitioner()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public Iqicoreprocedurerequest setPerformer(Reference param)
   {
      adaptedClass.setPerformer(param);
      return this;
   }

   public Practitioner getPerformerPractitionerTarget()
   {
      return (org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
            .getPerformerTarget();
   }

   public Iqicoreprocedurerequest setPerformerTarget(Practitioner param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public qicorepractitionerAdapter getPerformerPractitionerAdapterTarget()
   {
      if (adaptedClass.getPerformer().getResource() instanceof org.hl7.fhir.dstu3.model.Practitioner)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepractitionerAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Practitioner) adaptedClass
                     .getPerformer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setPerformerAdapterTarget(
         qicorepractitionerAdapter param)
   {
      adaptedClass.setPerformerTarget(param.getAdaptee());
      return this;
   }

   public Reference getPerformerOrganization()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public Organization getPerformerOrganizationTarget()
   {
      return (org.hl7.fhir.dstu3.model.Organization) adaptedClass
            .getPerformerTarget();
   }

   public Iqicoreprocedurerequest setPerformerTarget(Organization param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public qicoreorganizationAdapter getPerformerOrganizationAdapterTarget()
   {
      if (adaptedClass.getPerformer().getResource() instanceof org.hl7.fhir.dstu3.model.Organization)
      {
         org.socraticgrid.fhir.dstu3.generated.qicoreorganizationAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicoreorganizationAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Organization) adaptedClass
                     .getPerformer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setPerformerAdapterTarget(
         qicoreorganizationAdapter param)
   {
      adaptedClass.setPerformerTarget(param.getAdaptee());
      return this;
   }

   public Reference getPerformerPatient()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public Patient getPerformerPatientTarget()
   {
      return (org.hl7.fhir.dstu3.model.Patient) adaptedClass
            .getPerformerTarget();
   }

   public Iqicoreprocedurerequest setPerformerTarget(Patient param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public qicorepatientAdapter getPerformerPatientAdapterTarget()
   {
      if (adaptedClass.getPerformer().getResource() instanceof org.hl7.fhir.dstu3.model.Patient)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorepatientAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.Patient) adaptedClass
                     .getPerformer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setPerformerAdapterTarget(
         qicorepatientAdapter param)
   {
      adaptedClass.setPerformerTarget(param.getAdaptee());
      return this;
   }

   public Reference getPerformerRelatedPerson()
   {
      try
      {
         return adaptedClass.getPerformer();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Performer", e);
      }
   }

   public RelatedPerson getPerformerRelatedPersonTarget()
   {
      return (org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
            .getPerformerTarget();
   }

   public Iqicoreprocedurerequest setPerformerTarget(RelatedPerson param)
   {
      adaptedClass.setPerformerTarget(param);
      return this;
   }

   public qicorerelatedpersonAdapter getPerformerRelatedPersonAdapterTarget()
   {
      if (adaptedClass.getPerformer().getResource() instanceof org.hl7.fhir.dstu3.model.RelatedPerson)
      {
         org.socraticgrid.fhir.dstu3.generated.qicorerelatedpersonAdapter profiledType = new org.socraticgrid.fhir.dstu3.generated.qicorerelatedpersonAdapter();
         profiledType
               .setAdaptee((org.hl7.fhir.dstu3.model.RelatedPerson) adaptedClass
                     .getPerformer().getResource());
         return profiledType;
      }
      else
      {
         return null;
      }
   }

   public Iqicoreprocedurerequest setPerformerAdapterTarget(
         qicorerelatedpersonAdapter param)
   {
      adaptedClass.setPerformerTarget(param.getAdaptee());
      return this;
   }

   public List<BodySite> getApproachBodySite() {
		List<org.hl7.fhir.dstu3.model.Extension> extensions = adaptedClass
				.getExtensionsByUrl("http://hl7.org/fhir/StructureDefinition/procedurerequest-approachBodySite");
		List<org.hl7.fhir.dstu3.model.BodySite> returnList = new java.util.ArrayList<>();
		for (org.hl7.fhir.dstu3.model.Extension extension : extensions) {
			org.hl7.fhir.dstu3.model.Reference reference = (org.hl7.fhir.dstu3.model.Reference) extension
					.getValue();
			returnList.add((org.hl7.fhir.dstu3.model.BodySite) reference
					.getResource());
		}
		return returnList;
	}

   public Iqicoreprocedurerequest setApproachBodySite(List<BodySite> param)
   {
      if (param != null && param.size() > 0)
      {
         for (int index = 0; index < param.size(); index++)
         {
            org.hl7.fhir.dstu3.model.Reference reference = new org.hl7.fhir.dstu3.model.Reference(
                  param.get(index));
            adaptedClass
                  .addExtension()
                  .setUrl("http://hl7.org/fhir/StructureDefinition/procedurerequest-approachBodySite")
                  .setValue(reference);
         }
      }
      return this;
   }

   public CodeableConcept getCode()
   {
      try
      {
         return adaptedClass.getCode();
      }
      catch (Exception e)
      {
         throw new RuntimeException("Error getting Code", e);
      }
   }

   public Iqicoreprocedurerequest setCode(CodeableConcept param)
   {
      adaptedClass.setCode(param);
      return this;
   }

   public boolean hasCode()
   {
      return adaptedClass.hasCode();
   }
}