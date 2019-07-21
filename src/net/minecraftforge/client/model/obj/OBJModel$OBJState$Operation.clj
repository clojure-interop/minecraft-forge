(ns net.minecraftforge.client.model.obj.OBJModel$OBJState$Operation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.obj OBJModel$OBJState$Operation]))

(def SET_TRUE
  "Enum Constant.

  type: net.minecraftforge.client.model.obj.OBJModel$OBJState$Operation"
  OBJModel$OBJState$Operation/SET_TRUE)

(def SET_FALSE
  "Enum Constant.

  type: net.minecraftforge.client.model.obj.OBJModel$OBJState$Operation"
  OBJModel$OBJState$Operation/SET_FALSE)

(def TOGGLE
  "Enum Constant.

  type: net.minecraftforge.client.model.obj.OBJModel$OBJState$Operation"
  OBJModel$OBJState$Operation/TOGGLE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (OBJModel.OBJState.Operation c : OBJModel.OBJState.Operation.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.client.model.obj.OBJModel$OBJState$Operation[]`"
  ([]
    (OBJModel$OBJState$Operation/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.client.model.obj.OBJModel$OBJState$Operation`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.client.model.obj.OBJModel$OBJState$Operation [^java.lang.String name]
    (OBJModel$OBJState$Operation/valueOf name)))

(defn perform-operation
  "value-to-toggle - `boolean`

  returns: `boolean`"
  (^Boolean [^OBJModel$OBJState$Operation this ^Boolean value-to-toggle]
    (-> this (.performOperation value-to-toggle))))

