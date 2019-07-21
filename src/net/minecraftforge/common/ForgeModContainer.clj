(ns net.minecraftforge.common.ForgeModContainer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common ForgeModContainer]))

(defn ->forge-mod-container
  "Constructor."
  (^ForgeModContainer []
    (new ForgeModContainer )))

(def *-version-check-cat
  "Static Constant.

  type: java.lang.String"
  ForgeModContainer/VERSION_CHECK_CAT)

(defn *-clumping-threshold
  "Static Field.

  type: int"
  []
  ForgeModContainer/clumpingThreshold)

(defn *-remove-erroring-entities
  "Static Field.

  type: boolean"
  []
  ForgeModContainer/removeErroringEntities)

(defn *-remove-erroring-tile-entities
  "Static Field.

  type: boolean"
  []
  ForgeModContainer/removeErroringTileEntities)

(defn *-full-bounding-box-ladders
  "Static Field.

  type: boolean"
  []
  ForgeModContainer/fullBoundingBoxLadders)

(defn *-zombie-summon-base-chance
  "Static Field.

  type: double"
  []
  ForgeModContainer/zombieSummonBaseChance)

(defn *-blend-ranges
  "Static Field.

  type: int[]"
  []
  ForgeModContainer/blendRanges)

(defn *-zombie-baby-chance
  "Static Field.

  type: float"
  []
  ForgeModContainer/zombieBabyChance)

(defn *-should-sort-recipies
  "Static Field.

  type: boolean"
  []
  ForgeModContainer/shouldSortRecipies)

(defn *-disable-version-check
  "Static Field.

  type: boolean"
  []
  ForgeModContainer/disableVersionCheck)

(defn *-forge-light-pipeline-enabled
  "Static Field.

  type: boolean"
  []
  ForgeModContainer/forgeLightPipelineEnabled)

(defn *-replace-vanilla-bucket-model
  "Static Field.

  type: boolean"
  []
  ForgeModContainer/replaceVanillaBucketModel)

(defn *-zoom-in-missing-model-text-in-gui
  "Static Field.

  type: boolean"
  []
  ForgeModContainer/zoomInMissingModelTextInGui)

(defn *-java-8-reminder
  "Static Field.

  type: long"
  []
  ForgeModContainer/java8Reminder)

(defn *-disable-stair-slab-culling
  "Static Field.

  type: boolean"
  []
  ForgeModContainer/disableStairSlabCulling)

(defn *-always-setup-terrain-off-thread
  "Static Field.

  type: boolean"
  []
  ForgeModContainer/alwaysSetupTerrainOffThread)

(defn universal-bucket
  "Instance Field.

  type: net.minecraftforge.fluids.UniversalBucket"
  (^net.minecraftforge.fluids.UniversalBucket [^ForgeModContainer this]
    (-> this .-universalBucket)))

(defn *get-instance
  "returns: `net.minecraftforge.common.ForgeModContainer`"
  (^net.minecraftforge.common.ForgeModContainer []
    (ForgeModContainer/getInstance )))

(defn *get-config
  "returns: `net.minecraftforge.common.config.Configuration`"
  (^net.minecraftforge.common.config.Configuration []
    (ForgeModContainer/getConfig )))

(defn *update-nag
  ""
  ([]
    (ForgeModContainer/updateNag )))

(defn missing-mapping
  "event - `net.minecraftforge.fml.common.event.FMLMissingMappingsEvent`"
  ([^ForgeModContainer this ^net.minecraftforge.fml.common.event.FMLMissingMappingsEvent event]
    (-> this (.missingMapping event))))

(defn get-signing-certificate
  "returns: `java.security.cert.Certificate`"
  (^java.security.cert.Certificate [^ForgeModContainer this]
    (-> this (.getSigningCertificate))))

(defn get-update-url
  "returns: `java.net.URL`"
  (^java.net.URL [^ForgeModContainer this]
    (-> this (.getUpdateUrl))))

(defn mapping-changed
  "evt - `net.minecraftforge.fml.common.event.FMLModIdMappingEvent`"
  ([^ForgeModContainer this ^net.minecraftforge.fml.common.event.FMLModIdMappingEvent evt]
    (-> this (.mappingChanged evt))))

(defn get-data-for-writing
  "handler - `net.minecraft.world.storage.SaveHandler`
  info - `net.minecraft.world.storage.WorldInfo`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^ForgeModContainer this ^net.minecraft.world.storage.SaveHandler handler ^net.minecraft.world.storage.WorldInfo info]
    (-> this (.getDataForWriting handler info))))

(defn on-config-changed
  "By subscribing to the OnConfigChangedEvent we are able to execute code when our config screens are closed.
   This implementation uses the optional configID string to handle multiple Configurations using one event handler.

  event - `net.minecraftforge.fml.client.event.ConfigChangedEvent$OnConfigChangedEvent`"
  ([^ForgeModContainer this ^net.minecraftforge.fml.client.event.ConfigChangedEvent$OnConfigChangedEvent event]
    (-> this (.onConfigChanged event))))

(defn on-available
  "evt - `net.minecraftforge.fml.common.event.FMLLoadCompleteEvent`"
  ([^ForgeModContainer this ^net.minecraftforge.fml.common.event.FMLLoadCompleteEvent evt]
    (-> this (.onAvailable evt))))

(defn read-data
  "handler - `net.minecraft.world.storage.SaveHandler`
  info - `net.minecraft.world.storage.WorldInfo`
  property-map - `java.util.Map`
  tag - `net.minecraft.nbt.NBTTagCompound`"
  ([^ForgeModContainer this ^net.minecraft.world.storage.SaveHandler handler ^net.minecraft.world.storage.WorldInfo info ^java.util.Map property-map ^net.minecraft.nbt.NBTTagCompound tag]
    (-> this (.readData handler info property-map tag))))

(defn mod-construction
  "evt - `net.minecraftforge.fml.common.event.FMLConstructionEvent`"
  ([^ForgeModContainer this ^net.minecraftforge.fml.common.event.FMLConstructionEvent evt]
    (-> this (.modConstruction evt))))

(defn get-gui-class-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ForgeModContainer this]
    (-> this (.getGuiClassName))))

(defn get-source
  "Description copied from interface: ModContainer

  returns: `java.io.File`"
  (^java.io.File [^ForgeModContainer this]
    (-> this (.getSource))))

(defn get-custom-resource-pack-class
  "returns: `java.lang.Class<?>`"
  (^java.lang.Class [^ForgeModContainer this]
    (-> this (.getCustomResourcePackClass))))

(defn register-bus
  "Description copied from interface: ModContainer

  bus - `com.google.common.eventbus.EventBus`
  controller - `net.minecraftforge.fml.common.LoadController`

  returns: `boolean`"
  (^Boolean [^ForgeModContainer this ^com.google.common.eventbus.EventBus bus ^net.minecraftforge.fml.common.LoadController controller]
    (-> this (.registerBus bus controller))))

(defn server-starting
  "evt - `net.minecraftforge.fml.common.event.FMLServerStartingEvent`"
  ([^ForgeModContainer this ^net.minecraftforge.fml.common.event.FMLServerStartingEvent evt]
    (-> this (.serverStarting evt))))

(defn pre-init
  "evt - `net.minecraftforge.fml.common.event.FMLPreInitializationEvent`"
  ([^ForgeModContainer this ^net.minecraftforge.fml.common.event.FMLPreInitializationEvent evt]
    (-> this (.preInit evt))))

(defn get-owned-packages
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ForgeModContainer this]
    (-> this (.getOwnedPackages))))

(defn post-init
  "evt - `net.minecraftforge.fml.common.event.FMLPostInitializationEvent`"
  ([^ForgeModContainer this ^net.minecraftforge.fml.common.event.FMLPostInitializationEvent evt]
    (-> this (.postInit evt))))

(defn player-login
  "event - `net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerLoggedInEvent`"
  ([^ForgeModContainer this ^net.minecraftforge.fml.common.gameevent.PlayerEvent$PlayerLoggedInEvent event]
    (-> this (.playerLogin event))))

