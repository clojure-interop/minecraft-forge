(ns net.minecraftforge.common.animation.TimeValues$CommonTimeValueTypeAdapterFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.animation TimeValues$CommonTimeValueTypeAdapterFactory]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.common.animation.TimeValues$CommonTimeValueTypeAdapterFactory"
  TimeValues$CommonTimeValueTypeAdapterFactory/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TimeValues.CommonTimeValueTypeAdapterFactory c : TimeValues.CommonTimeValueTypeAdapterFactory.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.common.animation.TimeValues$CommonTimeValueTypeAdapterFactory[]`"
  ([]
    (TimeValues$CommonTimeValueTypeAdapterFactory/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.common.animation.TimeValues$CommonTimeValueTypeAdapterFactory`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.common.animation.TimeValues$CommonTimeValueTypeAdapterFactory [^java.lang.String name]
    (TimeValues$CommonTimeValueTypeAdapterFactory/valueOf name)))

(defn set-value-resolver
  "value-resolver - `com.google.common.base.Function`"
  ([^TimeValues$CommonTimeValueTypeAdapterFactory this ^com.google.common.base.Function value-resolver]
    (-> this (.setValueResolver value-resolver))))

(defn create
  "gson - `com.google.gson.Gson`
  type - `com.google.gson.reflect.TypeToken`

  returns: `<T> com.google.gson.TypeAdapter<T>`"
  ([^TimeValues$CommonTimeValueTypeAdapterFactory this ^com.google.gson.Gson gson ^com.google.gson.reflect.TypeToken type]
    (-> this (.create gson type))))

