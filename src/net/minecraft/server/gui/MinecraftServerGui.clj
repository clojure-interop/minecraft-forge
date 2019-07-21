(ns net.minecraft.server.gui.MinecraftServerGui
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.server.gui MinecraftServerGui]))

(defn ->minecraft-server-gui
  "Constructor.

  server-in - `net.minecraft.server.dedicated.DedicatedServer`"
  (^MinecraftServerGui [^net.minecraft.server.dedicated.DedicatedServer server-in]
    (new MinecraftServerGui server-in)))

(defn *create-server-gui
  "server-in - `net.minecraft.server.dedicated.DedicatedServer`"
  ([^net.minecraft.server.dedicated.DedicatedServer server-in]
    (MinecraftServerGui/createServerGui server-in)))

(defn append-line
  "text-area - `javax.swing.JTextArea`
  scroll-pane - `javax.swing.JScrollPane`
  line - `java.lang.String`"
  ([^MinecraftServerGui this ^javax.swing.JTextArea text-area ^javax.swing.JScrollPane scroll-pane ^java.lang.String line]
    (-> this (.appendLine text-area scroll-pane line))))

