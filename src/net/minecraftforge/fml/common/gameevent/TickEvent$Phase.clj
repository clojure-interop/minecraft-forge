(ns net.minecraftforge.fml.common.gameevent.TickEvent$Phase
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.gameevent TickEvent$Phase]))

(def START
  "Enum Constant.

  type: net.minecraftforge.fml.common.gameevent.TickEvent$Phase"
  TickEvent$Phase/START)

(def END
  "Enum Constant.

  type: net.minecraftforge.fml.common.gameevent.TickEvent$Phase"
  TickEvent$Phase/END)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (TickEvent.Phase c : TickEvent.Phase.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.common.gameevent.TickEvent$Phase[]`"
  ([]
    (TickEvent$Phase/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.common.gameevent.TickEvent$Phase`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.common.gameevent.TickEvent$Phase [^java.lang.String name]
    (TickEvent$Phase/valueOf name)))

