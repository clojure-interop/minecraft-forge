(ns net.minecraftforge.common.model.animation.Clips$IdentityClip
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation Clips$IdentityClip]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.common.model.animation.Clips$IdentityClip"
  Clips$IdentityClip/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Clips.IdentityClip c : Clips.IdentityClip.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.common.model.animation.Clips$IdentityClip[]`"
  ([]
    (Clips$IdentityClip/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.common.model.animation.Clips$IdentityClip`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.common.model.animation.Clips$IdentityClip [^java.lang.String name]
    (Clips$IdentityClip/valueOf name)))

(defn apply
  "joint - `net.minecraftforge.common.model.animation.IJoint`

  returns: `net.minecraftforge.common.model.animation.IJointClip`"
  (^net.minecraftforge.common.model.animation.IJointClip [^Clips$IdentityClip this ^net.minecraftforge.common.model.animation.IJoint joint]
    (-> this (.apply joint))))

(defn past-events
  "last-poll-time - `float`
  time - `float`

  returns: `java.lang.Iterable<net.minecraftforge.common.animation.Event>`"
  (^java.lang.Iterable [^Clips$IdentityClip this ^Float last-poll-time ^Float time]
    (-> this (.pastEvents last-poll-time time))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^Clips$IdentityClip this]
    (-> this (.getName))))

