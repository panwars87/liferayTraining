<div class="hello_liferay_layout" id="main-content" role="main">
	#if ($browserSniffer.isIe($request) && $browserSniffer.getMajorVersion($request) < 8)
		<table class="portlet-layout">
		<tr>
			<td class="aui-w30 portlet-column portlet-column-first" id="column-1">
				$processor.processColumn("column-1", "portlet-column-content portlet-column-content-first")
			</td>
			<td class="aui-w70 portlet-column portlet-column-last" id="column-2">
				<table class="portlet-layout">
				<tr>
					<td class="aui-w100 portlet-column portlet-column-only" id="column-2">
						$processor.processColumn("column-2", "portlet-column-content portlet-column-content-only")
					</td>
				</tr>
				</table>
			</td>
		</tr>
		</table>
	#else
		<div class="portlet-layout">
			<div class="aui-w30 portlet-column portlet-column-first" id="column-1">
				$processor.processColumn("column-1", "portlet-column-content portlet-column-content-first")
			</div>

			<div class="aui-w70 portlet-column portlet-column-last" id="column-2">
				<div class="portlet-layout">
					<div class="aui-w100 portlet-column portlet-column-only" id="column-2">
						$processor.processColumn("column-2", "portlet-column-content portlet-column-content-only")
					</div>
				</div>
			</div>
		</div>
	#end
</div>