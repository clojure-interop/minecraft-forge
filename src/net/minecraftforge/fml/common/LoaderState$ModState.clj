(ns net.minecraftforge.fml.common.LoaderState$ModState
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common LoaderState$ModState]))

(def UNLOADED
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState$ModState"
  LoaderState$ModState/UNLOADED)

(def LOADED
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState$ModState"
  LoaderState$ModState/LOADED)

(def CONSTRUCTED
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState$ModState"
  LoaderState$ModState/CONSTRUCTED)

(def PREINITIALIZED
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState$ModState"
  LoaderState$ModState/PREINITIALIZED)

(def INITIALIZED
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState$ModState"
  LoaderState$ModState/INITIALIZED)

(def POSTINITIALIZED
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState$ModState"
  LoaderState$ModState/POSTINITIALIZED)

(def AVAILABLE
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState$ModState"
  LoaderState$ModState/AVAILABLE)

(def DISABLED
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState$ModState"
  LoaderState$ModState/DISABLED)

(def ERRORED
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState$ModState"
  LoaderState$ModState/ERRORED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (LoaderState.ModState c : LoaderState.ModState.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.common.LoaderState$ModState[]`"
  ([]
    (LoaderState$ModState/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.common.LoaderState$ModState`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.common.LoaderState$ModState [^java.lang.String name]
    (LoaderState$ModState/valueOf name)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LoaderState$ModState this]
    (-> this (.toString))))

(defn get-marker
  "returns: `java.lang.String`"
  (^java.lang.String [^LoaderState$ModState this]
    (-> this (.getMarker))))

