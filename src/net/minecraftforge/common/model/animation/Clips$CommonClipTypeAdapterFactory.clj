(ns net.minecraftforge.common.model.animation.Clips$CommonClipTypeAdapterFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation Clips$CommonClipTypeAdapterFactory]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.common.model.animation.Clips$CommonClipTypeAdapterFactory"
  Clips$CommonClipTypeAdapterFactory/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Clips.CommonClipTypeAdapterFactory c : Clips.CommonClipTypeAdapterFactory.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.common.model.animation.Clips$CommonClipTypeAdapterFactory[]`"
  ([]
    (Clips$CommonClipTypeAdapterFactory/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.common.model.animation.Clips$CommonClipTypeAdapterFactory`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.common.model.animation.Clips$CommonClipTypeAdapterFactory [^java.lang.String name]
    (Clips$CommonClipTypeAdapterFactory/valueOf name)))

(defn set-clip-resolver
  "clip-resolver - `com.google.common.base.Function`"
  ([^Clips$CommonClipTypeAdapterFactory this ^com.google.common.base.Function clip-resolver]
    (-> this (.setClipResolver clip-resolver))))

(defn create
  "gson - `com.google.gson.Gson`
  type - `com.google.gson.reflect.TypeToken`

  returns: `<T> com.google.gson.TypeAdapter<T>`"
  ([^Clips$CommonClipTypeAdapterFactory this ^com.google.gson.Gson gson ^com.google.gson.reflect.TypeToken type]
    (-> this (.create gson type))))

