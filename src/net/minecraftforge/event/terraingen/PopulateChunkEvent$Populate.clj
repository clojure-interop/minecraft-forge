(ns net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate
  "PopulateChunkEvent.Populate is fired when a chunk is populated with a terrain feature.
  This event is fired during terrain feature generation in
  ChunkProviderEnd.populate(int, int),
  ChunkProviderOverworld.populate(int, int),
  and ChunkProviderHell.populate(int, int).

  type contains the enum value for the terrain feature being generated.

  This event is not Cancelable.

  This event has a result. HasResult
  This result determines if the chunk is populated with the terrain feature.

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen PopulateChunkEvent$Populate]))

(defn ->populate
  "Constructor.

  gen - `net.minecraft.world.chunk.IChunkGenerator`
  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  chunk-x - `int`
  chunk-z - `int`
  has-village-generated - `boolean`
  type - `net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType`"
  (^PopulateChunkEvent$Populate [^net.minecraft.world.chunk.IChunkGenerator gen ^net.minecraft.world.World world ^java.util.Random rand ^Integer chunk-x ^Integer chunk-z ^Boolean has-village-generated ^net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType type]
    (new PopulateChunkEvent$Populate gen world rand chunk-x chunk-z has-village-generated type)))

(defn get-type
  "returns: `net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType`"
  (^net.minecraftforge.event.terraingen.PopulateChunkEvent$Populate$EventType [^PopulateChunkEvent$Populate this]
    (-> this (.getType))))

