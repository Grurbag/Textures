// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class WFMModelWhiteLionHelmet extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer hvost;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;

	public WFMModelWhiteLionHelmet() {
		texWidth = 64;
		texHeight = 64;

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, -1.0F, 0.0F);
		Head.texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.75F, false);
		Head.texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 10.0F, 8.0F, 1.0F, false);
		Head.texOffs(32, 18).addBox(-4.0F, -11.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F, false);
		Head.texOffs(56, 61).addBox(-1.5F, -11.0F, -4.0F, 3.0F, 2.0F, 1.0F, 0.1F, false);
		Head.texOffs(56, 57).addBox(-1.5F, -13.0F, -3.0F, 3.0F, 2.0F, 1.0F, 0.1F, false);
		Head.texOffs(56, 55).addBox(-1.5F, -14.0F, -2.0F, 3.0F, 1.0F, 1.0F, 0.1F, false);
		Head.texOffs(35, 28).addBox(-3.0F, -13.0F, -3.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);
		Head.texOffs(39, 36).addBox(-2.0F, -14.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
		Head.texOffs(42, 41).addBox(-1.0F, -15.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		Head.texOffs(0, 51).addBox(-3.5F, -9.0F, -5.2F, 7.0F, 13.0F, 0.0F, 0.0F, false);

		hvost = new ModelRenderer(this);
		hvost.setPos(0.0F, -5.0F, 0.0F);
		Head.addChild(hvost);
		

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0007F, -10.3258F, 5.5959F);
		hvost.addChild(head_r1);
		setRotationAngle(head_r1, 0.0873F, 0.0F, 0.0F);
		head_r1.texOffs(52, 42).addBox(-1.5F, 0.5F, -1.0F, 3.0F, 6.0F, 3.0F, -0.3F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setPos(0.0007F, -15.2229F, 3.3459F);
		hvost.addChild(head_r2);
		setRotationAngle(head_r2, 0.5236F, 0.0F, 0.0F);
		head_r2.texOffs(35, 48).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 9.0F, 4.0F, -0.2F, false);

		head_r3 = new ModelRenderer(this);
		head_r3.setPos(0.0007F, -14.5968F, 1.6515F);
		hvost.addChild(head_r3);
		setRotationAngle(head_r3, 1.8762F, 0.0F, 0.0F);
		head_r3.texOffs(8, 21).addBox(-2.0F, -3.0F, -1.6F, 4.0F, 6.0F, 4.0F, -0.4F, false);

		head_r4 = new ModelRenderer(this);
		head_r4.setPos(0.0007F, -11.2229F, 0.0459F);
		hvost.addChild(head_r4);
		setRotationAngle(head_r4, 0.0F, 0.0F, 0.0F);
		head_r4.texOffs(0, 25).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, -0.2F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}