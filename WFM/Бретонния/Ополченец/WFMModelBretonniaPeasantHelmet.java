// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelBretonniaPeasantHelmet extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer hat_r1;
	private final ModelRenderer hat_r2;
	private final ModelRenderer hat_r3;

	public WFMModelBretonniaPeasantHelmet() {
		texWidth = 64;
		texHeight = 64;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.75F, false);
		head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 1.0F, false);
		head.texOffs(0, 22).addBox(-2.5F, -11.0F, -2.5076F, 5.0F, 2.0F, 5.0F, -0.2F, false);
		head.texOffs(0, 36).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.1F, false);

		hat = new ModelRenderer(this);
		hat.setPos(0.0F, -5.0F, 0.0F);
		head.addChild(hat);
		hat.texOffs(40, 52).addBox(5.0F, -2.0F, -5.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
		hat.texOffs(46, 36).addBox(7.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		hat_r1 = new ModelRenderer(this);
		hat_r1.setPos(0.0F, 0.0F, 0.0F);
		hat.addChild(hat_r1);
		setRotationAngle(hat_r1, 0.0F, -1.5708F, 0.0F);
		hat_r1.texOffs(40, 52).addBox(5.0F, -2.0F, -5.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
		hat_r1.texOffs(46, 36).addBox(7.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		hat_r2 = new ModelRenderer(this);
		hat_r2.setPos(0.0F, 0.0F, 0.0F);
		hat.addChild(hat_r2);
		setRotationAngle(hat_r2, 0.0F, 3.1416F, 0.0F);
		hat_r2.texOffs(40, 52).addBox(5.0F, -2.0F, -5.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
		hat_r2.texOffs(46, 36).addBox(7.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);

		hat_r3 = new ModelRenderer(this);
		hat_r3.setPos(0.0F, 0.0F, 0.0F);
		hat.addChild(hat_r3);
		setRotationAngle(hat_r3, 0.0F, 1.5708F, 0.0F);
		hat_r3.texOffs(40, 52).addBox(5.0F, -2.0F, -5.0F, 2.0F, 2.0F, 10.0F, 0.0F, false);
		hat_r3.texOffs(46, 36).addBox(7.0F, -1.0F, -4.0F, 1.0F, 1.0F, 8.0F, 0.0F, false);
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