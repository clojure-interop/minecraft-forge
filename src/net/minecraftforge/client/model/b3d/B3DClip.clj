(ns net.minecraftforge.client.model.b3d.B3DClip
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.b3d B3DClip]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.client.model.b3d.B3DClip"
  B3DClip/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (B3DClip c : B3DClip.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.client.model.b3d.B3DClip[]`"
  ([]
    (B3DClip/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.client.model.b3d.B3DClip`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.client.model.b3d.B3DClip [^java.lang.String name]
    (B3DClip/valueOf name)))

(defn apply
  "joint - `net.minecraftforge.common.model.animation.IJoint`

  returns: `net.minecraftforge.common.model.animation.IJointClip`"
  (^net.minecraftforge.common.model.animation.IJointClip [^B3DClip this ^net.minecraftforge.common.model.animation.IJoint joint]
    (-> this (.apply joint))))

(defn past-events
  "last-poll-time - `float`
  time - `float`

  returns: `java.lang.Iterable<net.minecraftforge.common.animation.Event>`"
  (^java.lang.Iterable [^B3DClip this ^Float last-poll-time ^Float time]
    (-> this (.pastEvents last-poll-time time))))

