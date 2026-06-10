// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelSkinWolfHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer jaw_top2;

	public WFMModelSkinWolfHelmet() {
		texWidth = 256;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(1.0F, -24.6F, -10.0F);
		setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
		head.texOffs(51, 0).addBox(-5.5F, -7.3823F, -11.4523F, 10.0F, 11.0F, 10.0F, 0.7F, false);

		jaw_top2 = new ModelRenderer(this);
		jaw_top2.setPos(0.5F, 0.2101F, -1.5266F);
		head.addChild(jaw_top2);
		setRotationAngle(jaw_top2, 0.1367F, 0.0F, 0.0F);
		jaw_top2.texOffs(50, 25).addBox(-5.0F, -5.6501F, -18.1559F, 8.0F, 7.0F, 10.0F, 0.7F, false);
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