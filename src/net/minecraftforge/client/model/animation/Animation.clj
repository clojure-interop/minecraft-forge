(ns net.minecraftforge.client.model.animation.Animation
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model.animation Animation]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.client.model.animation.Animation"
  Animation/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Animation c : Animation.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.client.model.animation.Animation[]`"
  ([]
    (Animation/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.client.model.animation.Animation`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.client.model.animation.Animation [^java.lang.String name]
    (Animation/valueOf name)))

(defn *get-world-time
  "Get the global world time for the current tick  partial tick progress, in seconds.

  world - `net.minecraft.world.World`
  tick-progress - `float`

  returns: `float`"
  (^Float [^net.minecraft.world.World world ^Float tick-progress]
    (Animation/getWorldTime world tick-progress))
  (^Float [^net.minecraft.world.World world]
    (Animation/getWorldTime world)))

(defn *get-partial-tick-time
  "Get current partialTickTime.

  returns: `float`"
  (^Float []
    (Animation/getPartialTickTime )))

(defn *set-client-partial-tick-time
  "Internal hook, do not use.

  client-partial-tick-time - `float`"
  ([^Float client-partial-tick-time]
    (Animation/setClientPartialTickTime client-partial-tick-time)))

