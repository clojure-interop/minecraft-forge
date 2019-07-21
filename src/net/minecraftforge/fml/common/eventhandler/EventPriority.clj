(ns net.minecraftforge.fml.common.eventhandler.EventPriority
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.eventhandler EventPriority]))

(def HIGHEST
  "Enum Constant.

  type: net.minecraftforge.fml.common.eventhandler.EventPriority"
  EventPriority/HIGHEST)

(def HIGH
  "Enum Constant.

  type: net.minecraftforge.fml.common.eventhandler.EventPriority"
  EventPriority/HIGH)

(def NORMAL
  "Enum Constant.

  type: net.minecraftforge.fml.common.eventhandler.EventPriority"
  EventPriority/NORMAL)

(def LOW
  "Enum Constant.

  type: net.minecraftforge.fml.common.eventhandler.EventPriority"
  EventPriority/LOW)

(def LOWEST
  "Enum Constant.

  type: net.minecraftforge.fml.common.eventhandler.EventPriority"
  EventPriority/LOWEST)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (EventPriority c : EventPriority.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.common.eventhandler.EventPriority[]`"
  ([]
    (EventPriority/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.common.eventhandler.EventPriority`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.common.eventhandler.EventPriority [^java.lang.String name]
    (EventPriority/valueOf name)))

(defn invoke
  "event - `net.minecraftforge.fml.common.eventhandler.Event`"
  ([^EventPriority this ^net.minecraftforge.fml.common.eventhandler.Event event]
    (-> this (.invoke event))))

