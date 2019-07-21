(ns net.minecraft.client.settings.GameSettings$Options
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.settings GameSettings$Options]))

(def INVERT_MOUSE
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/INVERT_MOUSE)

(def SENSITIVITY
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/SENSITIVITY)

(def FOV
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/FOV)

(def GAMMA
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/GAMMA)

(def SATURATION
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/SATURATION)

(def RENDER_DISTANCE
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/RENDER_DISTANCE)

(def VIEW_BOBBING
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/VIEW_BOBBING)

(def ANAGLYPH
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/ANAGLYPH)

(def FRAMERATE_LIMIT
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/FRAMERATE_LIMIT)

(def FBO_ENABLE
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/FBO_ENABLE)

(def RENDER_CLOUDS
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/RENDER_CLOUDS)

(def GRAPHICS
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/GRAPHICS)

(def AMBIENT_OCCLUSION
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/AMBIENT_OCCLUSION)

(def GUI_SCALE
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/GUI_SCALE)

(def PARTICLES
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/PARTICLES)

(def CHAT_VISIBILITY
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/CHAT_VISIBILITY)

(def CHAT_COLOR
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/CHAT_COLOR)

(def CHAT_LINKS
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/CHAT_LINKS)

(def CHAT_OPACITY
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/CHAT_OPACITY)

(def CHAT_LINKS_PROMPT
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/CHAT_LINKS_PROMPT)

(def SNOOPER_ENABLED
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/SNOOPER_ENABLED)

(def USE_FULLSCREEN
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/USE_FULLSCREEN)

(def ENABLE_VSYNC
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/ENABLE_VSYNC)

(def USE_VBO
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/USE_VBO)

(def TOUCHSCREEN
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/TOUCHSCREEN)

(def CHAT_SCALE
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/CHAT_SCALE)

(def CHAT_WIDTH
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/CHAT_WIDTH)

(def CHAT_HEIGHT_FOCUSED
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/CHAT_HEIGHT_FOCUSED)

(def CHAT_HEIGHT_UNFOCUSED
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/CHAT_HEIGHT_UNFOCUSED)

(def MIPMAP_LEVELS
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/MIPMAP_LEVELS)

(def FORCE_UNICODE_FONT
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/FORCE_UNICODE_FONT)

(def REDUCED_DEBUG_INFO
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/REDUCED_DEBUG_INFO)

(def ENTITY_SHADOWS
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/ENTITY_SHADOWS)

(def MAIN_HAND
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/MAIN_HAND)

(def ATTACK_INDICATOR
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/ATTACK_INDICATOR)

(def ENABLE_WEAK_ATTACKS
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/ENABLE_WEAK_ATTACKS)

(def SHOW_SUBTITLES
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/SHOW_SUBTITLES)

(def REALMS_NOTIFICATIONS
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/REALMS_NOTIFICATIONS)

(def AUTO_JUMP
  "Enum Constant.

  type: net.minecraft.client.settings.GameSettings$Options"
  GameSettings$Options/AUTO_JUMP)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (GameSettings.Options c : GameSettings.Options.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraft.client.settings.GameSettings$Options[]`"
  ([]
    (GameSettings$Options/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraft.client.settings.GameSettings$Options`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraft.client.settings.GameSettings$Options [^java.lang.String name]
    (GameSettings$Options/valueOf name)))

(defn *get-enum-options
  "ordinal - `int`

  returns: `net.minecraft.client.settings.GameSettings$Options`"
  (^net.minecraft.client.settings.GameSettings$Options [^Integer ordinal]
    (GameSettings$Options/getEnumOptions ordinal)))

(defn get-value-min
  "returns: `float`"
  (^Float [^GameSettings$Options this]
    (-> this (.getValueMin))))

(defn get-enum-string
  "returns: `java.lang.String`"
  (^java.lang.String [^GameSettings$Options this]
    (-> this (.getEnumString))))

(defn normalize-value
  "value - `float`

  returns: `float`"
  (^Float [^GameSettings$Options this ^Float value]
    (-> this (.normalizeValue value))))

(defn denormalize-value
  "value - `float`

  returns: `float`"
  (^Float [^GameSettings$Options this ^Float value]
    (-> this (.denormalizeValue value))))

(defn get-enum-boolean?
  "returns: `boolean`"
  (^Boolean [^GameSettings$Options this]
    (-> this (.getEnumBoolean))))

(defn snap-to-step-clamp
  "value - `float`

  returns: `float`"
  (^Float [^GameSettings$Options this ^Float value]
    (-> this (.snapToStepClamp value))))

(defn set-value-max
  "value - `float`"
  ([^GameSettings$Options this ^Float value]
    (-> this (.setValueMax value))))

(defn get-enum-float?
  "returns: `boolean`"
  (^Boolean [^GameSettings$Options this]
    (-> this (.getEnumFloat))))

(defn get-value-max
  "returns: `float`"
  (^Float [^GameSettings$Options this]
    (-> this (.getValueMax))))

(defn return-enum-ordinal
  "returns: `int`"
  (^Integer [^GameSettings$Options this]
    (-> this (.returnEnumOrdinal))))

