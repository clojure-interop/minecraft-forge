(ns net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderBlockOverlayEvent$OverlayType]))

(def FIRE
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType"
  RenderBlockOverlayEvent$OverlayType/FIRE)

(def BLOCK
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType"
  RenderBlockOverlayEvent$OverlayType/BLOCK)

(def WATER
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType"
  RenderBlockOverlayEvent$OverlayType/WATER)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (RenderBlockOverlayEvent.OverlayType c : RenderBlockOverlayEvent.OverlayType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType[]`"
  ([]
    (RenderBlockOverlayEvent$OverlayType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType [^java.lang.String name]
    (RenderBlockOverlayEvent$OverlayType/valueOf name)))

