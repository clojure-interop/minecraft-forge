(ns net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.event RenderGameOverlayEvent$ElementType]))

(def ALL
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/ALL)

(def HELMET
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/HELMET)

(def PORTAL
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/PORTAL)

(def CROSSHAIRS
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/CROSSHAIRS)

(def BOSSHEALTH
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/BOSSHEALTH)

(def BOSSINFO
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/BOSSINFO)

(def ARMOR
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/ARMOR)

(def HEALTH
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/HEALTH)

(def FOOD
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/FOOD)

(def AIR
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/AIR)

(def HOTBAR
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/HOTBAR)

(def EXPERIENCE
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/EXPERIENCE)

(def TEXT
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/TEXT)

(def HEALTHMOUNT
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/HEALTHMOUNT)

(def JUMPBAR
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/JUMPBAR)

(def CHAT
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/CHAT)

(def PLAYER_LIST
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/PLAYER_LIST)

(def DEBUG
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/DEBUG)

(def POTION_ICONS
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/POTION_ICONS)

(def SUBTITLES
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/SUBTITLES)

(def FPS_GRAPH
  "Enum Constant.

  type: net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType"
  RenderGameOverlayEvent$ElementType/FPS_GRAPH)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (RenderGameOverlayEvent.ElementType c : RenderGameOverlayEvent.ElementType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType[]`"
  ([]
    (RenderGameOverlayEvent$ElementType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType [^java.lang.String name]
    (RenderGameOverlayEvent$ElementType/valueOf name)))

