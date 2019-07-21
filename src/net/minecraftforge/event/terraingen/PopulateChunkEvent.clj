(ns net.minecraftforge.event.terraingen.PopulateChunkEvent
  "PopulateChunkEvent is fired when an event involving chunk terrain feature population occurs.
  If a method utilizes this Event as its parameter, the method will
  receive every child event of this class.

  world contains the world this event is occurring in.
  rand contains an instance of random that can be used in this event.
  chunkX contains the x-coordinate of the chunk currently being populated with a terrain feature.
  chunkZ contains the z-coordinate of the chunk currently being populated with ores.
  hasVillageGenerated contains the boolean value stating if the chunk already has a village spawned in it.

  All children of this event are fired on the MinecraftForge.EVENT_BUS, except PopulateChunkEvent.Populate, which fires on the MinecraftForge.TERRAIN_GEN_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen PopulateChunkEvent]))

(defn ->populate-chunk-event
  "Constructor.

  gen - `net.minecraft.world.chunk.IChunkGenerator`
  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  chunk-x - `int`
  chunk-z - `int`
  has-village-generated - `boolean`"
  (^PopulateChunkEvent [^net.minecraft.world.chunk.IChunkGenerator gen ^net.minecraft.world.World world ^java.util.Random rand ^Integer chunk-x ^Integer chunk-z ^Boolean has-village-generated]
    (new PopulateChunkEvent gen world rand chunk-x chunk-z has-village-generated)))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^PopulateChunkEvent this]
    (-> this (.getWorld))))

(defn get-rand
  "returns: `java.util.Random`"
  (^java.util.Random [^PopulateChunkEvent this]
    (-> this (.getRand))))

(defn get-chunk-x
  "returns: `int`"
  (^Integer [^PopulateChunkEvent this]
    (-> this (.getChunkX))))

(defn get-chunk-z
  "returns: `int`"
  (^Integer [^PopulateChunkEvent this]
    (-> this (.getChunkZ))))

(defn has-village-generated?
  "returns: `boolean`"
  (^Boolean [^PopulateChunkEvent this]
    (-> this (.isHasVillageGenerated))))

