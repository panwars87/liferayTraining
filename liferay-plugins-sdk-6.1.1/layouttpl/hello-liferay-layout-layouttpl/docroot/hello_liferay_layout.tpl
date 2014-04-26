<div class="hello_liferay_layout" id="main-content" role="main">
	#if ($browserSniffer.isIe($request) && $browserSniffer.getMajorVersion($request) < 8)
		<table class="portlet-layout">
		<tr>
			<td class="aui-w100 portlet-column portlet-column-only">
				<table class="portlet-layout">
				<tr>
					<td class="aui-w100 portlet-column portlet-column-only" id="column-1">
						$processor.processColumn("column-1", "portlet-column-content portlet-column-content-only")
						$processor.processPortlet("71_INSTANCE_xyz2")
					</td>
				</tr>
				</table>

				<table class="portlet-layout">
				<tr>
					<td class="aui-w100 portlet-column portlet-column-only">
						<table class="portlet-layout">
						<tr>
							<td class="aui-w50 portlet-column portlet-column-first" id="column-2">
								$processor.processColumn("column-2", "portlet-column-content portlet-column-content-first")
							</td>

							<td class="aui-w50 portlet-column portlet-column-last" id="column-3">
								$processor.processColumn("column-3", "portlet-column-content portlet-column-content-last")
								$processor.processPortlet("ipc-testing_WAR_ipctestingportlet");
							</td>
						</tr>
						</table>
					</td>
				</tr>
				</table>

				<table class="portlet-layout">
						<tr>
					<td class="aui-w100 portlet-column portlet-column-only" id="column-4">
						$processor.processColumn("column-4", "portlet-column-content portlet-column-content-only")
					</td>
				</tr>
				</table>
			</td>
		</tr>
		</table>
	#else
		<div class="portlet-layout">
			<div class="aui-w100 portlet-column portlet-column-only">
				<div class="portlet-layout">
					<div class="aui-w100 portlet-column portlet-column-only" id="column-1">
						$processor.processColumn("column-1", "portlet-column-content portlet-column-content-only")
						$processor.processPortlet("71_INSTANCE_xyz2")
					</div>
				</div>

				<div class="portlet-layout">
					<div class="aui-w100 portlet-column portlet-column-only">
						<div class="portlet-layout">
							<div class="aui-w50 portlet-column portlet-column-first" id="column-2">
								$processor.processColumn("column-2", "portlet-column-content portlet-column-content-first")
							</div>

							<div class="aui-w50 portlet-column portlet-column-last" id="column-3">
								$processor.processColumn("column-3", "portlet-column-content portlet-column-content-last")
								$processor.processPortlet("ipc-testing_WAR_ipctestingportlet");
							</div>
						</div>
					</div>
				</div>

				<div class="portlet-layout">
					<div class="aui-w100 portlet-column portlet-column-only" id="column-4">
						$processor.processColumn("column-4", "portlet-column-content portlet-column-content-only")
					</div>
				</div>
			</div>
		</div>
	#end
</div>