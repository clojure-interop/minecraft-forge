(ns net.minecraft.world.gen.structure.StructureVillagePieces$Start
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureVillagePieces$Start]))

(defn ->start
  "Constructor.

  chunk-manager-in - `net.minecraft.world.biome.BiomeProvider`
  p-i-2104-2 - `int`
  rand - `java.util.Random`
  p-i-2104-4 - `int`
  p-i-2104-5 - `int`
  p-i-2104-6 - `java.util.List`
  p-i-2104-7 - `int`"
  (^StructureVillagePieces$Start [^net.minecraft.world.biome.BiomeProvider chunk-manager-in ^Integer p-i-2104-2 ^java.util.Random rand ^Integer p-i-2104-4 ^Integer p-i-2104-5 ^java.util.List p-i-2104-6 ^Integer p-i-2104-7]
    (new StructureVillagePieces$Start chunk-manager-in p-i-2104-2 rand p-i-2104-4 p-i-2104-5 p-i-2104-6 p-i-2104-7))
  (^StructureVillagePieces$Start []
    (new StructureVillagePieces$Start )))

(defn world-chunk-mngr
  "Instance Field.

  type: net.minecraft.world.biome.BiomeProvider"
  (^net.minecraft.world.biome.BiomeProvider [^StructureVillagePieces$Start this]
    (-> this .-worldChunkMngr)))

(defn terrain-type
  "Instance Field.

  type: int"
  (^Integer [^StructureVillagePieces$Start this]
    (-> this .-terrainType)))

(defn struct-village-piece-weight
  "Instance Field.

  type: net.minecraft.world.gen.structure.StructureVillagePieces$PieceWeight"
  (^net.minecraft.world.gen.structure.StructureVillagePieces$PieceWeight [^StructureVillagePieces$Start this]
    (-> this .-structVillagePieceWeight)))

(defn structure-village-weighted-piece-list
  "Instance Field.

  type: java.util.List<net.minecraft.world.gen.structure.StructureVillagePieces$PieceWeight>"
  (^java.util.List [^StructureVillagePieces$Start this]
    (-> this .-structureVillageWeightedPieceList)))

(defn pending-houses
  "Instance Field.

  type: java.util.List<net.minecraft.world.gen.structure.StructureComponent>"
  (^java.util.List [^StructureVillagePieces$Start this]
    (-> this .-pendingHouses)))

(defn pending-roads
  "Instance Field.

  type: java.util.List<net.minecraft.world.gen.structure.StructureComponent>"
  (^java.util.List [^StructureVillagePieces$Start this]
    (-> this .-pendingRoads)))

(defn biome
  "Instance Field.

  type: net.minecraft.world.biome.Biome"
  (^net.minecraft.world.biome.Biome [^StructureVillagePieces$Start this]
    (-> this .-biome)))

