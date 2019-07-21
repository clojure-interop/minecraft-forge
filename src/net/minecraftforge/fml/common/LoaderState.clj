(ns net.minecraftforge.fml.common.LoaderState
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common LoaderState]))

(def NOINIT
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState"
  LoaderState/NOINIT)

(def LOADING
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState"
  LoaderState/LOADING)

(def CONSTRUCTING
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState"
  LoaderState/CONSTRUCTING)

(def PREINITIALIZATION
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState"
  LoaderState/PREINITIALIZATION)

(def INITIALIZATION
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState"
  LoaderState/INITIALIZATION)

(def POSTINITIALIZATION
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState"
  LoaderState/POSTINITIALIZATION)

(def AVAILABLE
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState"
  LoaderState/AVAILABLE)

(def SERVER_ABOUT_TO_START
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState"
  LoaderState/SERVER_ABOUT_TO_START)

(def SERVER_STARTING
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState"
  LoaderState/SERVER_STARTING)

(def SERVER_STARTED
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState"
  LoaderState/SERVER_STARTED)

(def SERVER_STOPPING
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState"
  LoaderState/SERVER_STOPPING)

(def SERVER_STOPPED
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState"
  LoaderState/SERVER_STOPPED)

(def ERRORED
  "Enum Constant.

  type: net.minecraftforge.fml.common.LoaderState"
  LoaderState/ERRORED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (LoaderState c : LoaderState.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.common.LoaderState[]`"
  ([]
    (LoaderState/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.common.LoaderState`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.common.LoaderState [^java.lang.String name]
    (LoaderState/valueOf name)))

(defn transition
  "errored - `boolean`

  returns: `net.minecraftforge.fml.common.LoaderState`"
  (^net.minecraftforge.fml.common.LoaderState [^LoaderState this ^Boolean errored]
    (-> this (.transition errored))))

(defn has-event?
  "returns: `boolean`"
  (^Boolean [^LoaderState this]
    (-> this (.hasEvent))))

(defn get-event
  "event-data - `java.lang.Object`

  returns: `net.minecraftforge.fml.common.event.FMLStateEvent`"
  (^net.minecraftforge.fml.common.event.FMLStateEvent [^LoaderState this ^java.lang.Object event-data]
    (-> this (.getEvent event-data))))

(defn required-state
  "returns: `net.minecraftforge.fml.common.LoaderState`"
  (^net.minecraftforge.fml.common.LoaderState [^LoaderState this]
    (-> this (.requiredState))))

(defn get-pretty-name
  "returns: `java.lang.String`"
  (^java.lang.String [^LoaderState this]
    (-> this (.getPrettyName))))

