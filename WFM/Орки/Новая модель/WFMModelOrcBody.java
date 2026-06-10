// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelOrcBody extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer rightArm;
	private final ModelRenderer shoulder2;
	private final ModelRenderer leftArm;
	private final ModelRenderer shoulder;

	public WFMModelOrcBody() {
		texWidth = 64;
		texHeight = 64;

		body = new ModelRenderer(this);
		body.setPos(0.0F, 4.0F, 0.0F);
		body.texOffs(26, 15).addBox(-6.0F, -10.0F, -3.5F, 12.0F, 16.0F, 7.0F, 1.3F, false);
		body.texOffs(26, 41).addBox(-6.0F, -10.0F, -3.5F, 12.0F, 16.0F, 7.0F, 1.0F, false);

		rightArm = new ModelRenderer(this);
		rightArm.setPos(-6.9564F, -2.999F, 0.0F);
		setRotationAngle(rightArm, 0.0F, 0.0436F, 0.0436F);
		rightArm.texOffs(0, 24).addBox(-4.8693F, 5.9952F, -2.9981F, 5.0F, 10.0F, 6.0F, 0.75F, false);
		rightArm.texOffs(0, 50).addBox(-4.8693F, -2.0048F, -3.4981F, 6.0F, 7.0F, 7.0F, 0.75F, false);

		shoulder2 = new ModelRenderer(this);
		shoulder2.setPos(-5.623F, -0.9968F, -0.0032F);
		rightArm.addChild(shoulder2);
		setRotationAngle(shoulder2, 0.0F, 0.0F, -0.5672F);
		shoulder2.texOffs(32, 0).addBox(-2.1307F, -1.0048F, -4.4981F, 7.0F, 6.0F, 9.0F, 0.75F, true);
		shoulder2.texOffs(0, 0).addBox(-2.1307F, -1.0048F, -4.4981F, 7.0F, 6.0F, 9.0F, 0.35F, true);

		leftArm = new ModelRenderer(this);
		leftArm.setPos(6.9564F, -2.999F, 0.0F);
		setRotationAngle(leftArm, 0.0F, -0.0436F, -0.0436F);
		leftArm.texOffs(0, 24).addBox(-0.1307F, 5.9952F, -2.9981F, 5.0F, 10.0F, 6.0F, 0.75F, true);
		leftArm.texOffs(0, 50).addBox(-1.1307F, -2.0048F, -3.4981F, 6.0F, 7.0F, 7.0F, 0.75F, true);

		shoulder = new ModelRenderer(this);
		shoulder.setPos(2.7863F, -0.0874F, 0.0019F);
		leftArm.addChild(shoulder);
		setRotationAngle(shoulder, 0.0F, 0.0F, 0.5236F);
		shoulder.texOffs(32, 0).addBox(-3.5F, -3.0F, -4.5F, 7.0F, 6.0F, 9.0F, 0.75F, true);
		shoulder.texOffs(0, 0).addBox(-3.5F, -3.0F, -4.5F, 7.0F, 6.0F, 9.0F, 0.35F, true);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}