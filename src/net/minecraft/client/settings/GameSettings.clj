(ns net.minecraft.client.settings.GameSettings
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.settings GameSettings]))

(defn ->game-settings
  "Constructor.

  mc-in - `net.minecraft.client.Minecraft`
  options-file-in - `java.io.File`"
  (^GameSettings [^net.minecraft.client.Minecraft mc-in ^java.io.File options-file-in]
    (new GameSettings mc-in options-file-in))
  (^GameSettings []
    (new GameSettings )))

(def *-colon-splitter
  "Static Constant.

  type: com.google.common.base.Splitter"
  GameSettings/COLON_SPLITTER)

(defn mouse-sensitivity
  "Instance Field.

  type: float"
  (^Float [^GameSettings this]
    (-> this .-mouseSensitivity)))

(defn invert-mouse
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-invertMouse)))

(defn render-distance-chunks
  "Instance Field.

  type: int"
  (^Integer [^GameSettings this]
    (-> this .-renderDistanceChunks)))

(defn view-bobbing
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-viewBobbing)))

(defn anaglyph
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-anaglyph)))

(defn fbo-enable
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-fboEnable)))

(defn limit-framerate
  "Instance Field.

  type: int"
  (^Integer [^GameSettings this]
    (-> this .-limitFramerate)))

(defn clouds
  "Instance Field.

  type: int"
  (^Integer [^GameSettings this]
    (-> this .-clouds)))

(defn fancy-graphics
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-fancyGraphics)))

(defn ambient-occlusion
  "Instance Field.

  type: int"
  (^Integer [^GameSettings this]
    (-> this .-ambientOcclusion)))

(defn resource-packs
  "Instance Field.

  type: java.util.List<java.lang.String>"
  (^java.util.List [^GameSettings this]
    (-> this .-resourcePacks)))

(defn incompatible-resource-packs
  "Instance Field.

  type: java.util.List<java.lang.String>"
  (^java.util.List [^GameSettings this]
    (-> this .-incompatibleResourcePacks)))

(defn chat-visibility
  "Instance Field.

  type: net.minecraft.entity.player.EntityPlayer$EnumChatVisibility"
  (^net.minecraft.entity.player.EntityPlayer$EnumChatVisibility [^GameSettings this]
    (-> this .-chatVisibility)))

(defn chat-colours
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-chatColours)))

(defn chat-links
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-chatLinks)))

(defn chat-links-prompt
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-chatLinksPrompt)))

(defn chat-opacity
  "Instance Field.

  type: float"
  (^Float [^GameSettings this]
    (-> this .-chatOpacity)))

(defn snooper-enabled
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-snooperEnabled)))

(defn full-screen
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-fullScreen)))

(defn enable-vsync
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-enableVsync)))

(defn use-vbo
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-useVbo)))

(defn reduced-debug-info
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-reducedDebugInfo)))

(defn hide-server-address
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-hideServerAddress)))

(defn advanced-item-tooltips
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-advancedItemTooltips)))

(defn pause-on-lost-focus
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-pauseOnLostFocus)))

(defn touchscreen
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-touchscreen)))

(defn main-hand
  "Instance Field.

  type: net.minecraft.util.EnumHandSide"
  (^net.minecraft.util.EnumHandSide [^GameSettings this]
    (-> this .-mainHand)))

(defn override-width
  "Instance Field.

  type: int"
  (^Integer [^GameSettings this]
    (-> this .-overrideWidth)))

(defn override-height
  "Instance Field.

  type: int"
  (^Integer [^GameSettings this]
    (-> this .-overrideHeight)))

(defn held-item-tooltips
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-heldItemTooltips)))

(defn chat-scale
  "Instance Field.

  type: float"
  (^Float [^GameSettings this]
    (-> this .-chatScale)))

(defn chat-width
  "Instance Field.

  type: float"
  (^Float [^GameSettings this]
    (-> this .-chatWidth)))

(defn chat-height-unfocused
  "Instance Field.

  type: float"
  (^Float [^GameSettings this]
    (-> this .-chatHeightUnfocused)))

(defn chat-height-focused
  "Instance Field.

  type: float"
  (^Float [^GameSettings this]
    (-> this .-chatHeightFocused)))

(defn show-inventory-achievement-hint
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-showInventoryAchievementHint)))

(defn mipmap-levels
  "Instance Field.

  type: int"
  (^Integer [^GameSettings this]
    (-> this .-mipmapLevels)))

(defn use-native-transport
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-useNativeTransport)))

(defn entity-shadows
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-entityShadows)))

(defn attack-indicator
  "Instance Field.

  type: int"
  (^Integer [^GameSettings this]
    (-> this .-attackIndicator)))

(defn enable-weak-attacks
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-enableWeakAttacks)))

(defn show-subtitles
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-showSubtitles)))

(defn realms-notifications
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-realmsNotifications)))

(defn auto-jump
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-autoJump)))

(defn key-bind-forward
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindForward)))

(defn key-bind-left
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindLeft)))

(defn key-bind-back
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindBack)))

(defn key-bind-right
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindRight)))

(defn key-bind-jump
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindJump)))

(defn key-bind-sneak
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindSneak)))

(defn key-bind-sprint
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindSprint)))

(defn key-bind-inventory
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindInventory)))

(defn key-bind-swap-hands
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindSwapHands)))

(defn key-bind-drop
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindDrop)))

(defn key-bind-use-item
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindUseItem)))

(defn key-bind-attack
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindAttack)))

(defn key-bind-pick-block
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindPickBlock)))

(defn key-bind-chat
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindChat)))

(defn key-bind-player-list
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindPlayerList)))

(defn key-bind-command
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindCommand)))

(defn key-bind-screenshot
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindScreenshot)))

(defn key-bind-toggle-perspective
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindTogglePerspective)))

(defn key-bind-smooth-camera
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindSmoothCamera)))

(defn key-bind-fullscreen
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindFullscreen)))

(defn key-bind-spectator-outlines
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding"
  (^net.minecraft.client.settings.KeyBinding [^GameSettings this]
    (-> this .-keyBindSpectatorOutlines)))

(defn key-binds-hotbar
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding[]"
  ([^GameSettings this]
    (-> this .-keyBindsHotbar)))

(defn key-bindings
  "Instance Field.

  type: net.minecraft.client.settings.KeyBinding[]"
  ([^GameSettings this]
    (-> this .-keyBindings)))

(defn difficulty
  "Instance Field.

  type: net.minecraft.world.EnumDifficulty"
  (^net.minecraft.world.EnumDifficulty [^GameSettings this]
    (-> this .-difficulty)))

(defn hide-gui
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-hideGUI)))

(defn third-person-view
  "Instance Field.

  type: int"
  (^Integer [^GameSettings this]
    (-> this .-thirdPersonView)))

(defn show-debug-info
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-showDebugInfo)))

(defn show-debug-profiler-chart
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-showDebugProfilerChart)))

(defn show-lagometer
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-showLagometer)))

(defn last-server
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^GameSettings this]
    (-> this .-lastServer)))

(defn smooth-camera
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-smoothCamera)))

(defn debug-cam-enable
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-debugCamEnable)))

(defn fov-setting
  "Instance Field.

  type: float"
  (^Float [^GameSettings this]
    (-> this .-fovSetting)))

(defn gamma-setting
  "Instance Field.

  type: float"
  (^Float [^GameSettings this]
    (-> this .-gammaSetting)))

(defn saturation
  "Instance Field.

  type: float"
  (^Float [^GameSettings this]
    (-> this .-saturation)))

(defn gui-scale
  "Instance Field.

  type: int"
  (^Integer [^GameSettings this]
    (-> this .-guiScale)))

(defn particle-setting
  "Instance Field.

  type: int"
  (^Integer [^GameSettings this]
    (-> this .-particleSetting)))

(defn language
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^GameSettings this]
    (-> this .-language)))

(defn force-unicode-font
  "Instance Field.

  type: boolean"
  (^Boolean [^GameSettings this]
    (-> this .-forceUnicodeFont)))

(defn *get-key-display-string
  "key - `int`

  returns: `java.lang.String`"
  (^java.lang.String [^Integer key]
    (GameSettings/getKeyDisplayString key)))

(defn *key-down?
  "key - `net.minecraft.client.settings.KeyBinding`

  returns: `boolean`"
  (^Boolean [^net.minecraft.client.settings.KeyBinding key]
    (GameSettings/isKeyDown key)))

(defn get-option-ordinal-value?
  "setting-option - `net.minecraft.client.settings.GameSettings$Options`

  returns: `boolean`"
  (^Boolean [^GameSettings this ^net.minecraft.client.settings.GameSettings$Options setting-option]
    (-> this (.getOptionOrdinalValue setting-option))))

(defn should-render-clouds
  "returns: `int`"
  (^Integer [^GameSettings this]
    (-> this (.shouldRenderClouds))))

(defn using-native-transport?
  "returns: `boolean`"
  (^Boolean [^GameSettings this]
    (-> this (.isUsingNativeTransport))))

(defn on-gui-closed
  ""
  ([^GameSettings this]
    (-> this (.onGuiClosed))))

(defn set-option-value
  "settings-option - `net.minecraft.client.settings.GameSettings$Options`
  value - `int`"
  ([^GameSettings this ^net.minecraft.client.settings.GameSettings$Options settings-option ^Integer value]
    (-> this (.setOptionValue settings-option value))))

(defn get-option-float-value
  "setting-option - `net.minecraft.client.settings.GameSettings$Options`

  returns: `float`"
  (^Float [^GameSettings this ^net.minecraft.client.settings.GameSettings$Options setting-option]
    (-> this (.getOptionFloatValue setting-option))))

(defn set-model-part-enabled
  "model-part - `net.minecraft.entity.player.EnumPlayerModelParts`
  enable - `boolean`"
  ([^GameSettings this ^net.minecraft.entity.player.EnumPlayerModelParts model-part ^Boolean enable]
    (-> this (.setModelPartEnabled model-part enable))))

(defn get-key-binding
  "setting-option - `net.minecraft.client.settings.GameSettings$Options`

  returns: `java.lang.String`"
  (^java.lang.String [^GameSettings this ^net.minecraft.client.settings.GameSettings$Options setting-option]
    (-> this (.getKeyBinding setting-option))))

(defn get-sound-level
  "category - `net.minecraft.util.SoundCategory`

  returns: `float`"
  (^Float [^GameSettings this ^net.minecraft.util.SoundCategory category]
    (-> this (.getSoundLevel category))))

(defn set-option-key-binding
  "key - `net.minecraft.client.settings.KeyBinding`
  key-code - `int`"
  ([^GameSettings this ^net.minecraft.client.settings.KeyBinding key ^Integer key-code]
    (-> this (.setOptionKeyBinding key key-code))))

(defn get-model-parts
  "returns: `java.util.Set<net.minecraft.entity.player.EnumPlayerModelParts>`"
  (^java.util.Set [^GameSettings this]
    (-> this (.getModelParts))))

(defn load-options
  ""
  ([^GameSettings this]
    (-> this (.loadOptions))))

(defn set-option-float-value
  "settings-option - `net.minecraft.client.settings.GameSettings$Options`
  value - `float`"
  ([^GameSettings this ^net.minecraft.client.settings.GameSettings$Options settings-option ^Float value]
    (-> this (.setOptionFloatValue settings-option value))))

(defn set-sound-level
  "category - `net.minecraft.util.SoundCategory`
  volume - `float`"
  ([^GameSettings this ^net.minecraft.util.SoundCategory category ^Float volume]
    (-> this (.setSoundLevel category volume))))

(defn send-settings-to-server
  ""
  ([^GameSettings this]
    (-> this (.sendSettingsToServer))))

(defn switch-model-part-enabled
  "model-part - `net.minecraft.entity.player.EnumPlayerModelParts`"
  ([^GameSettings this ^net.minecraft.entity.player.EnumPlayerModelParts model-part]
    (-> this (.switchModelPartEnabled model-part))))

(defn save-options
  ""
  ([^GameSettings this]
    (-> this (.saveOptions))))

