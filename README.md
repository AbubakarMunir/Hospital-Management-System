# Hospital-Management-System
This is a basic hospital management system. I have made children ward,orthopedic ward and surgical ward as separate classes because although they do not have any extra attributes yet and it can be said that these do not have the potential to be separate classes but in a real time scenario such ward will have various distinguishing attributes. Moreover we werent asked to provide any functionality relative to wards. The basic functionality provided is that a patient comes and calls visitDoc function which takes in the name of doctor and current date as paramenters. As I have applied singleton pattern to FaisalHospital, so an object is created and it calls checkpatient of FaisalHospital class which then calls checkPatient of doctor.
