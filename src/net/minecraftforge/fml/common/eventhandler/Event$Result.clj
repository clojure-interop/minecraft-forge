(ns net.minecraftforge.fml.common.eventhandler.Event$Result
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.eventhandler Event$Result]))

(def DENY
  "Enum Constant.

  type: net.minecraftforge.fml.common.eventhandler.Event$Result"
  Event$Result/DENY)

(def DEFAULT
  "Enum Constant.

  type: net.minecraftforge.fml.common.eventhandler.Event$Result"
  Event$Result/DEFAULT)

(def ALLOW
  "Enum Constant.

  type: net.minecraftforge.fml.common.eventhandler.Event$Result"
  Event$Result/ALLOW)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Event.Result c : Event.Result.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.fml.common.eventhandler.Event$Result[]`"
  ([]
    (Event$Result/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.fml.common.eventhandler.Event$Result`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.fml.common.eventhandler.Event$Result [^java.lang.String name]
    (Event$Result/valueOf name)))

