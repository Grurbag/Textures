// Made with Blockbench 5.0.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelGraveGuardHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer wing_right;
	private final ModelRenderer wing_left;

	public WFMModelGraveGuardHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		head.texOffs(26, 19).addBox(-5.5F, -6.0F, -6.0F, 11.0F, 1.0F, 8.0F, 0.0F, false);
		head.texOffs(37, 28).addBox(-1.5F, -10.0F, -6.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
		head.texOffs(0, 22).addBox(-2.5F, -11.0F, -2.5076F, 5.0F, 2.0F, 5.0F, -0.2F, false);
		head.texOffs(0, 36).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		wing_right = new ModelRenderer(this);
		wing_right.setPos(-12.0F, -8.0F, 0.0F);
		head.addChild(wing_right);
		wing_right.texOffs(46, 49).addBox(-1.0F, -11.0F, 0.0F, 9.0F, 15.0F, 0.0F, 0.0F, true);

		wing_left = new ModelRenderer(this);
		wing_left.setPos(5.0F, -8.0F, 0.0F);
		head.addChild(wing_left);
		wing_left.texOffs(46, 49).addBox(-1.0F, -11.0F, 0.0F, 9.0F, 15.0F, 0.0F, 0.0F, false);
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