(ns net.minecraftforge.common.model.Models
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model Models]))

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Models c : Models.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.common.model.Models[]`"
  ([]
    (Models/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.common.model.Models`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.common.model.Models [^java.lang.String name]
    (Models/valueOf name)))

(defn *get-hidden-model-part
  "path - `com.google.common.collect.ImmutableList`

  returns: `net.minecraftforge.common.model.IModelPart`"
  (^net.minecraftforge.common.model.IModelPart [^com.google.common.collect.ImmutableList path]
    (Models/getHiddenModelPart path)))

(defn *get-parts
  "part - `net.minecraftforge.common.model.IModelPart`

  returns: `com.google.common.collect.UnmodifiableIterator<java.lang.String>`"
  (^com.google.common.collect.UnmodifiableIterator [^net.minecraftforge.common.model.IModelPart part]
    (Models/getParts part)))

