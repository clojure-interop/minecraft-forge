(ns net.minecraftforge.common.model.animation.JointClips$IdentityJointClip
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.model.animation JointClips$IdentityJointClip]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.common.model.animation.JointClips$IdentityJointClip"
  JointClips$IdentityJointClip/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (JointClips.IdentityJointClip c : JointClips.IdentityJointClip.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.common.model.animation.JointClips$IdentityJointClip[]`"
  ([]
    (JointClips$IdentityJointClip/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.common.model.animation.JointClips$IdentityJointClip`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.common.model.animation.JointClips$IdentityJointClip [^java.lang.String name]
    (JointClips$IdentityJointClip/valueOf name)))

(defn apply
  "time - `float`

  returns: `net.minecraftforge.common.model.TRSRTransformation`"
  (^net.minecraftforge.common.model.TRSRTransformation [^JointClips$IdentityJointClip this ^Float time]
    (-> this (.apply time))))

