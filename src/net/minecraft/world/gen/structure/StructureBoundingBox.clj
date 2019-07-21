(ns net.minecraft.world.gen.structure.StructureBoundingBox
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure StructureBoundingBox]))

(defn ->structure-bounding-box
  "Constructor.

  x-min - `int`
  y-min - `int`
  z-min - `int`
  x-max - `int`
  y-max - `int`
  z-max - `int`"
  (^StructureBoundingBox [^Integer x-min ^Integer y-min ^Integer z-min ^Integer x-max ^Integer y-max ^Integer z-max]
    (new StructureBoundingBox x-min y-min z-min x-max y-max z-max))
  (^StructureBoundingBox [^Integer x-min ^Integer z-min ^Integer x-max ^Integer z-max]
    (new StructureBoundingBox x-min z-min x-max z-max))
  (^StructureBoundingBox [^net.minecraft.util.math.Vec3i vec-1 ^net.minecraft.util.math.Vec3i vec-2]
    (new StructureBoundingBox vec-1 vec-2))
  (^StructureBoundingBox [coords]
    (new StructureBoundingBox coords))
  (^StructureBoundingBox []
    (new StructureBoundingBox )))

(defn min-x
  "Instance Field.

  type: int"
  (^Integer [^StructureBoundingBox this]
    (-> this .-minX)))

(defn min-y
  "Instance Field.

  type: int"
  (^Integer [^StructureBoundingBox this]
    (-> this .-minY)))

(defn min-z
  "Instance Field.

  type: int"
  (^Integer [^StructureBoundingBox this]
    (-> this .-minZ)))

(defn max-x
  "Instance Field.

  type: int"
  (^Integer [^StructureBoundingBox this]
    (-> this .-maxX)))

(defn max-y
  "Instance Field.

  type: int"
  (^Integer [^StructureBoundingBox this]
    (-> this .-maxY)))

(defn max-z
  "Instance Field.

  type: int"
  (^Integer [^StructureBoundingBox this]
    (-> this .-maxZ)))

(defn *get-new-bounding-box
  "returns: `net.minecraft.world.gen.structure.StructureBoundingBox`"
  (^net.minecraft.world.gen.structure.StructureBoundingBox []
    (StructureBoundingBox/getNewBoundingBox )))

(defn *get-component-to-add-bounding-box
  "structure-min-x - `int`
  structure-min-y - `int`
  structure-min-z - `int`
  x-min - `int`
  y-min - `int`
  z-min - `int`
  x-max - `int`
  y-max - `int`
  z-max - `int`
  facing - `net.minecraft.util.EnumFacing`

  returns: `net.minecraft.world.gen.structure.StructureBoundingBox`"
  (^net.minecraft.world.gen.structure.StructureBoundingBox [^Integer structure-min-x ^Integer structure-min-y ^Integer structure-min-z ^Integer x-min ^Integer y-min ^Integer z-min ^Integer x-max ^Integer y-max ^Integer z-max ^net.minecraft.util.EnumFacing facing]
    (StructureBoundingBox/getComponentToAddBoundingBox structure-min-x structure-min-y structure-min-z x-min y-min z-min x-max y-max z-max facing)))

(defn *create-proper
  "p-175899-0 - `int`
  p-175899-1 - `int`
  p-175899-2 - `int`
  p-175899-3 - `int`
  p-175899-4 - `int`
  p-175899-5 - `int`

  returns: `net.minecraft.world.gen.structure.StructureBoundingBox`"
  (^net.minecraft.world.gen.structure.StructureBoundingBox [^Integer p-175899-0 ^Integer p-175899-1 ^Integer p-175899-2 ^Integer p-175899-3 ^Integer p-175899-4 ^Integer p-175899-5]
    (StructureBoundingBox/createProper p-175899-0 p-175899-1 p-175899-2 p-175899-3 p-175899-4 p-175899-5)))

(defn to-nbt-tag-int-array
  "returns: `net.minecraft.nbt.NBTTagIntArray`"
  (^net.minecraft.nbt.NBTTagIntArray [^StructureBoundingBox this]
    (-> this (.toNBTTagIntArray))))

(defn offset
  "x - `int`
  y - `int`
  z - `int`"
  ([^StructureBoundingBox this ^Integer x ^Integer y ^Integer z]
    (-> this (.offset x y z))))

(defn get-z-size
  "returns: `int`"
  (^Integer [^StructureBoundingBox this]
    (-> this (.getZSize))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StructureBoundingBox this]
    (-> this (.toString))))

(defn get-x-size
  "returns: `int`"
  (^Integer [^StructureBoundingBox this]
    (-> this (.getXSize))))

(defn get-y-size
  "returns: `int`"
  (^Integer [^StructureBoundingBox this]
    (-> this (.getYSize))))

(defn get-length
  "returns: `net.minecraft.util.math.Vec3i`"
  (^net.minecraft.util.math.Vec3i [^StructureBoundingBox this]
    (-> this (.getLength))))

(defn intersects-with
  "min-x-in - `int`
  min-z-in - `int`
  max-x-in - `int`
  max-z-in - `int`

  returns: `boolean`"
  (^Boolean [^StructureBoundingBox this ^Integer min-x-in ^Integer min-z-in ^Integer max-x-in ^Integer max-z-in]
    (-> this (.intersectsWith min-x-in min-z-in max-x-in max-z-in)))
  (^Boolean [^StructureBoundingBox this ^net.minecraft.world.gen.structure.StructureBoundingBox structurebb]
    (-> this (.intersectsWith structurebb))))

(defn expand-to
  "sbb - `net.minecraft.world.gen.structure.StructureBoundingBox`"
  ([^StructureBoundingBox this ^net.minecraft.world.gen.structure.StructureBoundingBox sbb]
    (-> this (.expandTo sbb))))

(defn vec-inside?
  "vec - `net.minecraft.util.math.Vec3i`

  returns: `boolean`"
  (^Boolean [^StructureBoundingBox this ^net.minecraft.util.math.Vec3i vec]
    (-> this (.isVecInside vec))))

