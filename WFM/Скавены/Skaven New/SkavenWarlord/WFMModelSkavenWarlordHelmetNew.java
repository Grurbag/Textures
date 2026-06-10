// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSkavenWarlordHelmetNew extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer jaw_top;

	public WFMModelSkavenWarlordHelmetNew() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 6.0F, -4.0F);
		head.texOffs(0, 0).addBox(-3.5F, -6.0F, -7.0F, 7.0F, 6.0F, 6.0F, 0.75F, false);
		head.texOffs(38, 13).addBox(-3.5F, -6.0F, -7.0F, 7.0F, 8.0F, 6.0F, 1.0F, false);
		head.texOffs(0, 0).addBox(0.0F, -16.0F, -13.0F, 0.0F, 10.0F, 13.0F, 0.0F, false);

		jaw_top = new ModelRenderer(this);
		jaw_top.setPos(0.0F, -3.6667F, -9.0333F);
		head.addChild(jaw_top);
		setRotationAngle(jaw_top, 0.1745F, 0.0F, 0.0F);
		jaw_top.texOffs(44, 0).addBox(-2.5F, -1.9333F, -2.4667F, 5.0F, 7.0F, 5.0F, 0.75F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}