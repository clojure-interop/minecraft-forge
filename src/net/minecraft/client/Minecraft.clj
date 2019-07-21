(ns net.minecraft.client.Minecraft
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client Minecraft]))

(defn ->minecraft
  "Constructor.

  game-config - `net.minecraft.client.main.GameConfiguration`"
  (^Minecraft [^net.minecraft.client.main.GameConfiguration game-config]
    (new Minecraft game-config)))

(def *-is-running-on-mac
  "Static Constant.

  type: boolean"
  Minecraft/IS_RUNNING_ON_MAC)

(defn *-memory-reserve
  "Static Field.

  type: byte[]"
  []
  Minecraft/memoryReserve)

(defn render-engine
  "Instance Field.

  type: net.minecraft.client.renderer.texture.TextureManager"
  (^net.minecraft.client.renderer.texture.TextureManager [^Minecraft this]
    (-> this .-renderEngine)))

(defn player-controller
  "Instance Field.

  type: net.minecraft.client.multiplayer.PlayerControllerMP"
  (^net.minecraft.client.multiplayer.PlayerControllerMP [^Minecraft this]
    (-> this .-playerController)))

(defn display-width
  "Instance Field.

  type: int"
  (^Integer [^Minecraft this]
    (-> this .-displayWidth)))

(defn display-height
  "Instance Field.

  type: int"
  (^Integer [^Minecraft this]
    (-> this .-displayHeight)))

(defn world
  "Instance Field.

  type: net.minecraft.client.multiplayer.WorldClient"
  (^net.minecraft.client.multiplayer.WorldClient [^Minecraft this]
    (-> this .-world)))

(defn render-global
  "Instance Field.

  type: net.minecraft.client.renderer.RenderGlobal"
  (^net.minecraft.client.renderer.RenderGlobal [^Minecraft this]
    (-> this .-renderGlobal)))

(defn player
  "Instance Field.

  type: net.minecraft.client.entity.EntityPlayerSP"
  (^net.minecraft.client.entity.EntityPlayerSP [^Minecraft this]
    (-> this .-player)))

(defn pointed-entity
  "Instance Field.

  type: net.minecraft.entity.Entity"
  (^net.minecraft.entity.Entity [^Minecraft this]
    (-> this .-pointedEntity)))

(defn effect-renderer
  "Instance Field.

  type: net.minecraft.client.particle.ParticleManager"
  (^net.minecraft.client.particle.ParticleManager [^Minecraft this]
    (-> this .-effectRenderer)))

(defn font-renderer-obj
  "Instance Field.

  type: net.minecraft.client.gui.FontRenderer"
  (^net.minecraft.client.gui.FontRenderer [^Minecraft this]
    (-> this .-fontRendererObj)))

(defn standard-galactic-font-renderer
  "Instance Field.

  type: net.minecraft.client.gui.FontRenderer"
  (^net.minecraft.client.gui.FontRenderer [^Minecraft this]
    (-> this .-standardGalacticFontRenderer)))

(defn current-screen
  "Instance Field.

  type: net.minecraft.client.gui.GuiScreen"
  (^net.minecraft.client.gui.GuiScreen [^Minecraft this]
    (-> this .-currentScreen)))

(defn loading-screen
  "Instance Field.

  type: net.minecraft.client.LoadingScreenRenderer"
  (^net.minecraft.client.LoadingScreenRenderer [^Minecraft this]
    (-> this .-loadingScreen)))

(defn entity-renderer
  "Instance Field.

  type: net.minecraft.client.renderer.EntityRenderer"
  (^net.minecraft.client.renderer.EntityRenderer [^Minecraft this]
    (-> this .-entityRenderer)))

(defn debug-renderer
  "Instance Field.

  type: net.minecraft.client.renderer.debug.DebugRenderer"
  (^net.minecraft.client.renderer.debug.DebugRenderer [^Minecraft this]
    (-> this .-debugRenderer)))

(defn gui-achievement
  "Instance Field.

  type: net.minecraft.client.gui.achievement.GuiAchievement"
  (^net.minecraft.client.gui.achievement.GuiAchievement [^Minecraft this]
    (-> this .-guiAchievement)))

(defn ingame-gui
  "Instance Field.

  type: net.minecraft.client.gui.GuiIngame"
  (^net.minecraft.client.gui.GuiIngame [^Minecraft this]
    (-> this .-ingameGUI)))

(defn skip-render-world
  "Instance Field.

  type: boolean"
  (^Boolean [^Minecraft this]
    (-> this .-skipRenderWorld)))

(defn object-mouse-over
  "Instance Field.

  type: net.minecraft.util.math.RayTraceResult"
  (^net.minecraft.util.math.RayTraceResult [^Minecraft this]
    (-> this .-objectMouseOver)))

(defn game-settings
  "Instance Field.

  type: net.minecraft.client.settings.GameSettings"
  (^net.minecraft.client.settings.GameSettings [^Minecraft this]
    (-> this .-gameSettings)))

(defn mouse-helper
  "Instance Field.

  type: net.minecraft.util.MouseHelper"
  (^net.minecraft.util.MouseHelper [^Minecraft this]
    (-> this .-mouseHelper)))

(defn mc-data-dir
  "Instance Constant.

  type: java.io.File"
  (^java.io.File [^Minecraft this]
    (-> this .-mcDataDir)))

(defn in-game-has-focus
  "Instance Field.

  type: boolean"
  (^Boolean [^Minecraft this]
    (-> this .-inGameHasFocus)))

(defn frame-timer
  "Instance Constant.

  type: net.minecraft.util.FrameTimer"
  (^net.minecraft.util.FrameTimer [^Minecraft this]
    (-> this .-frameTimer)))

(defn mc-profiler
  "Instance Constant.

  type: net.minecraft.profiler.Profiler"
  (^net.minecraft.profiler.Profiler [^Minecraft this]
    (-> this .-mcProfiler)))

(defn mc-default-resource-pack
  "Instance Constant.

  type: net.minecraft.client.resources.DefaultResourcePack"
  (^net.minecraft.client.resources.DefaultResourcePack [^Minecraft this]
    (-> this .-mcDefaultResourcePack)))

(defn debug
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^Minecraft this]
    (-> this .-debug)))

(defn render-chunks-many
  "Instance Field.

  type: boolean"
  (^Boolean [^Minecraft this]
    (-> this .-renderChunksMany)))

(defn *gui-enabled?
  "returns: `boolean`"
  (^Boolean []
    (Minecraft/isGuiEnabled )))

(defn *fancy-graphics-enabled?
  "returns: `boolean`"
  (^Boolean []
    (Minecraft/isFancyGraphicsEnabled )))

(defn *ambient-occlusion-enabled?
  "returns: `boolean`"
  (^Boolean []
    (Minecraft/isAmbientOcclusionEnabled )))

(defn *get-minecraft
  "returns: `net.minecraft.client.Minecraft`"
  (^net.minecraft.client.Minecraft []
    (Minecraft/getMinecraft )))

(defn *get-gl-maximum-texture-size
  "returns: `int`"
  (^Integer []
    (Minecraft/getGLMaximumTextureSize )))

(defn *stop-integrated-server
  ""
  ([]
    (Minecraft/stopIntegratedServer )))

(defn *get-system-time
  "returns: `long`"
  (^Long []
    (Minecraft/getSystemTime )))

(defn *get-debug-fps
  "returns: `int`"
  (^Integer []
    (Minecraft/getDebugFPS )))

(defn demo?
  "returns: `boolean`"
  (^Boolean [^Minecraft this]
    (-> this (.isDemo))))

(defn add-server-type-to-snooper
  "player-snooper - `net.minecraft.profiler.Snooper`"
  ([^Minecraft this ^net.minecraft.profiler.Snooper player-snooper]
    (-> this (.addServerTypeToSnooper player-snooper))))

(defn game-paused?
  "returns: `boolean`"
  (^Boolean [^Minecraft this]
    (-> this (.isGamePaused))))

(defn dispatch-keypresses
  ""
  ([^Minecraft this]
    (-> this (.dispatchKeypresses))))

(defn connected-to-realms?
  "returns: `boolean`"
  (^Boolean [^Minecraft this]
    (-> this (.isConnectedToRealms))))

(defn crashed
  "crash - `net.minecraft.crash.CrashReport`"
  ([^Minecraft this ^net.minecraft.crash.CrashReport crash]
    (-> this (.crashed crash))))

(defn get-version-type
  "returns: `java.lang.String`"
  (^java.lang.String [^Minecraft this]
    (-> this (.getVersionType))))

(defn get-current-server-data
  "returns: `net.minecraft.client.multiplayer.ServerData`"
  (^net.minecraft.client.multiplayer.ServerData [^Minecraft this]
    (-> this (.getCurrentServerData))))

(defn set-dimension-and-spawn-player
  "dimension - `int`"
  ([^Minecraft this ^Integer dimension]
    (-> this (.setDimensionAndSpawnPlayer dimension))))

(defn set-connected-to-realms
  "is-connected - `boolean`"
  ([^Minecraft this ^Boolean is-connected]
    (-> this (.setConnectedToRealms is-connected))))

(defn get-item-colors
  "returns: `net.minecraft.client.renderer.color.ItemColors`"
  (^net.minecraft.client.renderer.color.ItemColors [^Minecraft this]
    (-> this (.getItemColors))))

(defn set-ingame-not-in-focus
  ""
  ([^Minecraft this]
    (-> this (.setIngameNotInFocus))))

(defn draw-splash-screen
  "texture-manager-instance - `net.minecraft.client.renderer.texture.TextureManager`

  throws: org.lwjgl.LWJGLException"
  ([^Minecraft this ^net.minecraft.client.renderer.texture.TextureManager texture-manager-instance]
    (-> this (.drawSplashScreen texture-manager-instance))))

(defn set-render-view-entity
  "viewing-entity - `net.minecraft.entity.Entity`"
  ([^Minecraft this ^net.minecraft.entity.Entity viewing-entity]
    (-> this (.setRenderViewEntity viewing-entity))))

(defn singleplayer?
  "returns: `boolean`"
  (^Boolean [^Minecraft this]
    (-> this (.isSingleplayer))))

(defn run-tick
  "throws: java.io.IOException"
  ([^Minecraft this]
    (-> this (.runTick))))

(defn get-render-item
  "returns: `net.minecraft.client.renderer.RenderItem`"
  (^net.minecraft.client.renderer.RenderItem [^Minecraft this]
    (-> this (.getRenderItem))))

(defn get-block-colors
  "returns: `net.minecraft.client.renderer.color.BlockColors`"
  (^net.minecraft.client.renderer.color.BlockColors [^Minecraft this]
    (-> this (.getBlockColors))))

(defn integrated-server-running?
  "returns: `boolean`"
  (^Boolean [^Minecraft this]
    (-> this (.isIntegratedServerRunning))))

(defn run
  ""
  ([^Minecraft this]
    (-> this (.run))))

(defn add-scheduled-task
  "callable-to-schedule - `java.util.concurrent.Callable`

  returns: `<V> com.google.common.util.concurrent.ListenableFuture<V>`"
  ([^Minecraft this ^java.util.concurrent.Callable callable-to-schedule]
    (-> this (.addScheduledTask callable-to-schedule))))

(defn get-session
  "returns: `net.minecraft.util.Session`"
  (^net.minecraft.util.Session [^Minecraft this]
    (-> this (.getSession))))

(defn get-render-partial-ticks
  "returns: `float`"
  (^Float [^Minecraft this]
    (-> this (.getRenderPartialTicks))))

(defn get-save-loader
  "returns: `net.minecraft.world.storage.ISaveFormat`"
  (^net.minecraft.world.storage.ISaveFormat [^Minecraft this]
    (-> this (.getSaveLoader))))

(defn add-server-stats-to-snooper
  "player-snooper - `net.minecraft.profiler.Snooper`"
  ([^Minecraft this ^net.minecraft.profiler.Snooper player-snooper]
    (-> this (.addServerStatsToSnooper player-snooper))))

(defn load-world
  "world-client-in - `net.minecraft.client.multiplayer.WorldClient`
  loading-message - `java.lang.String`"
  ([^Minecraft this ^net.minecraft.client.multiplayer.WorldClient world-client-in ^java.lang.String loading-message]
    (-> this (.loadWorld world-client-in loading-message)))
  ([^Minecraft this ^net.minecraft.client.multiplayer.WorldClient world-client-in]
    (-> this (.loadWorld world-client-in))))

(defn display-in-game-menu
  ""
  ([^Minecraft this]
    (-> this (.displayInGameMenu))))

(defn get-profile-properties
  "returns: `com.mojang.authlib.properties.PropertyMap`"
  (^com.mojang.authlib.properties.PropertyMap [^Minecraft this]
    (-> this (.getProfileProperties))))

(defn reduced-debug?
  "returns: `boolean`"
  (^Boolean [^Minecraft this]
    (-> this (.isReducedDebug))))

(defn schedule-resources-refresh
  "returns: `com.google.common.util.concurrent.ListenableFuture<java.lang.Object>`"
  (^com.google.common.util.concurrent.ListenableFuture [^Minecraft this]
    (-> this (.scheduleResourcesRefresh))))

(defn get-limit-framerate
  "returns: `int`"
  (^Integer [^Minecraft this]
    (-> this (.getLimitFramerate))))

(defn get-ambient-music-type
  "returns: `net.minecraft.client.audio.MusicTicker$MusicType`"
  (^net.minecraft.client.audio.MusicTicker$MusicType [^Minecraft this]
    (-> this (.getAmbientMusicType))))

(defn set-ingame-focus
  ""
  ([^Minecraft this]
    (-> this (.setIngameFocus))))

(defn get-player-usage-snooper
  "returns: `net.minecraft.profiler.Snooper`"
  (^net.minecraft.profiler.Snooper [^Minecraft this]
    (-> this (.getPlayerUsageSnooper))))

(defn add-graphics-and-world-to-crash-report
  "the-crash - `net.minecraft.crash.CrashReport`

  returns: `net.minecraft.crash.CrashReport`"
  (^net.minecraft.crash.CrashReport [^Minecraft this ^net.minecraft.crash.CrashReport the-crash]
    (-> this (.addGraphicsAndWorldToCrashReport the-crash))))

(defn display-gui-screen
  "gui-screen-in - `net.minecraft.client.gui.GuiScreen`"
  ([^Minecraft this ^net.minecraft.client.gui.GuiScreen gui-screen-in]
    (-> this (.displayGuiScreen gui-screen-in))))

(defn shutdown
  ""
  ([^Minecraft this]
    (-> this (.shutdown))))

(defn get-language-manager
  "returns: `net.minecraft.client.resources.LanguageManager`"
  (^net.minecraft.client.resources.LanguageManager [^Minecraft this]
    (-> this (.getLanguageManager))))

(defn unicode?
  "returns: `boolean`"
  (^Boolean [^Minecraft this]
    (-> this (.isUnicode))))

(defn get-version
  "returns: `java.lang.String`"
  (^java.lang.String [^Minecraft this]
    (-> this (.getVersion))))

(defn update-display
  ""
  ([^Minecraft this]
    (-> this (.updateDisplay))))

(defn get-item-renderer
  "returns: `net.minecraft.client.renderer.ItemRenderer`"
  (^net.minecraft.client.renderer.ItemRenderer [^Minecraft this]
    (-> this (.getItemRenderer))))

(defn get-proxy
  "returns: `java.net.Proxy`"
  (^java.net.Proxy [^Minecraft this]
    (-> this (.getProxy))))

(defn launch-integrated-server
  "folder-name - `java.lang.String`
  world-name - `java.lang.String`
  world-settings-in - `net.minecraft.world.WorldSettings`"
  ([^Minecraft this ^java.lang.String folder-name ^java.lang.String world-name ^net.minecraft.world.WorldSettings world-settings-in]
    (-> this (.launchIntegratedServer folder-name world-name world-settings-in))))

(defn snooper-enabled?
  "returns: `boolean`"
  (^Boolean [^Minecraft this]
    (-> this (.isSnooperEnabled))))

(defn framerate-limit-below-max?
  "returns: `boolean`"
  (^Boolean [^Minecraft this]
    (-> this (.isFramerateLimitBelowMax))))

(defn get-framebuffer
  "returns: `net.minecraft.client.shader.Framebuffer`"
  (^net.minecraft.client.shader.Framebuffer [^Minecraft this]
    (-> this (.getFramebuffer))))

(defn get-sound-handler
  "returns: `net.minecraft.client.audio.SoundHandler`"
  (^net.minecraft.client.audio.SoundHandler [^Minecraft this]
    (-> this (.getSoundHandler))))

(defn store-te-in-stack
  "stack - `net.minecraft.item.ItemStack`
  te - `net.minecraft.tileentity.TileEntity`

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^Minecraft this ^net.minecraft.item.ItemStack stack ^net.minecraft.tileentity.TileEntity te]
    (-> this (.storeTEInStack stack te))))

(defn toggle-fullscreen
  ""
  ([^Minecraft this]
    (-> this (.toggleFullscreen))))

(defn display-crash-report
  "crash-report-in - `net.minecraft.crash.CrashReport`"
  ([^Minecraft this ^net.minecraft.crash.CrashReport crash-report-in]
    (-> this (.displayCrashReport crash-report-in))))

(defn draw
  "pos-x - `int`
  pos-y - `int`
  tex-u - `int`
  tex-v - `int`
  width - `int`
  height - `int`
  red - `int`
  green - `int`
  blue - `int`
  alpha - `int`"
  ([^Minecraft this ^Integer pos-x ^Integer pos-y ^Integer tex-u ^Integer tex-v ^Integer width ^Integer height ^Integer red ^Integer green ^Integer blue ^Integer alpha]
    (-> this (.draw pos-x pos-y tex-u tex-v width height red green blue alpha))))

(defn free-memory
  ""
  ([^Minecraft this]
    (-> this (.freeMemory))))

(defn get-data-fixer
  "returns: `net.minecraft.util.datafix.DataFixer`"
  (^net.minecraft.util.datafix.DataFixer [^Minecraft this]
    (-> this (.getDataFixer))))

(defn java-64bit?
  "returns: `boolean`"
  (^Boolean [^Minecraft this]
    (-> this (.isJava64bit))))

(defn get-connection
  "returns: `net.minecraft.client.network.NetHandlerPlayClient`"
  (^net.minecraft.client.network.NetHandlerPlayClient [^Minecraft this]
    (-> this (.getConnection))))

(defn get-resource-pack-repository
  "returns: `net.minecraft.client.resources.ResourcePackRepository`"
  (^net.minecraft.client.resources.ResourcePackRepository [^Minecraft this]
    (-> this (.getResourcePackRepository))))

(defn set-server-data
  "server-data-in - `net.minecraft.client.multiplayer.ServerData`"
  ([^Minecraft this ^net.minecraft.client.multiplayer.ServerData server-data-in]
    (-> this (.setServerData server-data-in))))

(defn get-texture-manager
  "returns: `net.minecraft.client.renderer.texture.TextureManager`"
  (^net.minecraft.client.renderer.texture.TextureManager [^Minecraft this]
    (-> this (.getTextureManager))))

(defn get-frame-timer
  "returns: `net.minecraft.util.FrameTimer`"
  (^net.minecraft.util.FrameTimer [^Minecraft this]
    (-> this (.getFrameTimer))))

(defn get-resource-manager
  "returns: `net.minecraft.client.resources.IResourceManager`"
  (^net.minecraft.client.resources.IResourceManager [^Minecraft this]
    (-> this (.getResourceManager))))

(defn get-render-view-entity
  "returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^Minecraft this]
    (-> this (.getRenderViewEntity))))

(defn resize
  "width - `int`
  height - `int`"
  ([^Minecraft this ^Integer width ^Integer height]
    (-> this (.resize width height))))

(defn get-integrated-server
  "returns: `net.minecraft.server.integrated.IntegratedServer`"
  (^net.minecraft.server.integrated.IntegratedServer [^Minecraft this]
    (-> this (.getIntegratedServer))))

(defn calling-from-minecraft-thread?
  "returns: `boolean`"
  (^Boolean [^Minecraft this]
    (-> this (.isCallingFromMinecraftThread))))

(defn full-screen?
  "returns: `boolean`"
  (^Boolean [^Minecraft this]
    (-> this (.isFullScreen))))

(defn get-texture-map-blocks
  "returns: `net.minecraft.client.renderer.texture.TextureMap`"
  (^net.minecraft.client.renderer.texture.TextureMap [^Minecraft this]
    (-> this (.getTextureMapBlocks))))

(defn get-render-manager
  "returns: `net.minecraft.client.renderer.entity.RenderManager`"
  (^net.minecraft.client.renderer.entity.RenderManager [^Minecraft this]
    (-> this (.getRenderManager))))

(defn get-session-service
  "returns: `com.mojang.authlib.minecraft.MinecraftSessionService`"
  (^com.mojang.authlib.minecraft.MinecraftSessionService [^Minecraft this]
    (-> this (.getSessionService))))

(defn shutdown-minecraft-applet
  ""
  ([^Minecraft this]
    (-> this (.shutdownMinecraftApplet))))

(defn get-block-renderer-dispatcher
  "returns: `net.minecraft.client.renderer.BlockRendererDispatcher`"
  (^net.minecraft.client.renderer.BlockRendererDispatcher [^Minecraft this]
    (-> this (.getBlockRendererDispatcher))))

(defn get-skin-manager
  "returns: `net.minecraft.client.resources.SkinManager`"
  (^net.minecraft.client.resources.SkinManager [^Minecraft this]
    (-> this (.getSkinManager))))

(defn get-music-ticker
  "returns: `net.minecraft.client.audio.MusicTicker`"
  (^net.minecraft.client.audio.MusicTicker [^Minecraft this]
    (-> this (.getMusicTicker))))

(defn refresh-resources
  ""
  ([^Minecraft this]
    (-> this (.refreshResources))))

