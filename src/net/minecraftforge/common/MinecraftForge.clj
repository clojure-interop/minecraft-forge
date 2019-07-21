(ns net.minecraftforge.common.MinecraftForge
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common MinecraftForge]))

(defn ->minecraft-forge
  "Constructor."
  (^MinecraftForge []
    (new MinecraftForge )))

(def *-event-bus
  "Static Constant.

  The core Forge EventBusses, all events for Forge will be fired on these,
   you should use this to register all your listeners.
   This replaces every register*Handler() function in the old version of Forge.
   TERRAIN_GEN_BUS for terrain gen events
   ORE_GEN_BUS for ore gen events
   EVENT_BUS for everything else

  type: net.minecraftforge.fml.common.eventhandler.EventBus"
  MinecraftForge/EVENT_BUS)

(def *-terrain-gen-bus
  "Static Constant.

  type: net.minecraftforge.fml.common.eventhandler.EventBus"
  MinecraftForge/TERRAIN_GEN_BUS)

(def *-ore-gen-bus
  "Static Constant.

  type: net.minecraftforge.fml.common.eventhandler.EventBus"
  MinecraftForge/ORE_GEN_BUS)

(def *-mc-version
  "Static Constant.

  type: java.lang.String"
  MinecraftForge/MC_VERSION)

(defn *add-grass-seed
  "Register a new seed to be dropped when breaking tall grass.

  seed - The item to drop as a seed. - `net.minecraft.item.ItemStack`
  weight - The relative probability of the seeds, where wheat seeds are 10. Note: These functions may be going away soon, we're looking into loot tables.... - `int`"
  ([^net.minecraft.item.ItemStack seed ^Integer weight]
    (MinecraftForge/addGrassSeed seed weight))
  ([^net.minecraftforge.common.ForgeHooks.SeedEntry seed]
    (MinecraftForge/addGrassSeed seed)))

(defn *initialize
  "Method invoked by FML before any other mods are loaded."
  ([]
    (MinecraftForge/initialize )))

(defn *preload-crash-classes
  "table - `net.minecraftforge.fml.common.discovery.ASMDataTable`
  mod-id - `java.lang.String`
  classes - `java.util.Set`"
  ([^net.minecraftforge.fml.common.discovery.ASMDataTable table ^java.lang.String mod-id ^java.util.Set classes]
    (MinecraftForge/preloadCrashClasses table mod-id classes)))

